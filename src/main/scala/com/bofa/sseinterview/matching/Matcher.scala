package com.baml.gmrt.elt.sse.interview.matching

import com.baml.gmrt.elt.sse.interview.matching.Matcher.{MatchOutput, Trade}

object Matcher {

  type TradeId = Int
  type Quantity = Double

  /**
   * Represents the purchase or sale of some stock for some portfolio.  The net quantity of all the trades
   * may be long (positive) or short (negative).  Note that, for clarity, the price, portfolio and stock
   * have been omitted for this example.
   */
  case class Trade(tradeId: TradeId, quantity: Quantity)

  /**
   * When the first trade is added to a portfolio there are no other trades to pair so the trade is
   * considered to be an opening trade with an associated open quantity.
   */
  case class OpenTrade(tradeId: TradeId, openQuantity: Quantity)

  /**
   * When a new trade is added for which there exists an open trade in the opposite trading direction
   * then the new trade is considered to be a closing trade.  This will be combined with the open trade to
   * create a match.  The quantity will be in the same trading direction as the close and can not
   * be greater in magnitude than the open quantity of the open trade.
   *
   * Once a match is performed then any outstanding quantity is a candidate to match against
   * further open trades.  If there are no further open trades any outstanding quantity should
   * go on to form a new open quantity in the opposite trading direction to that held previously.
   *
   * Open trades should be selected for closing such that the open trade with the lowest trade Id
   * is closed first.
   */
  case class Match(openingTradeId: TradeId, closingTradeId: TradeId, quantity: Quantity)

  /**
   * The result of matching a collection of trades will be a set of matches and a set of open trades.
   */
  case class MatchOutput(matches: Set[Match], openTrades: Set[OpenTrade])
}

trait Matcher {
  /**
   * Process the provided set of trades in trade Id order to create a valid match output.
   *
   * For example given the following set of trades:
   *  Trade(1, 100)
   *  Trade(2, 200)
   *  Trade(3, -140)
   * Will produce a match output with the following matches:
   *  Match(1, 3, -100)
   *  Match(2, 3, -40)
   * And the following open trades:
   *  OpenTrade(2, 160)
   */
  def matchTrades(trades: Set[Trade]): MatchOutput
}
