package example

import akka.actor.{Actor, Props}

object CentreActor {
  case class Info(x: String)
  case class Hello(msg: String)
  
  def props(): Props = Props(new CentreActor)
}

class CentreActor extends Actor {
  import CentreActor._
  
  def receive: Receive = {
    case Info(x) => println(x)
    case Hello(m) => sender() ! Hello("This is Centre, COPY!")
    case _ => println("Not Support!")
  }
}