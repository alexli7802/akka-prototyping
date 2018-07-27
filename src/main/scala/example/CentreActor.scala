package example

import akka.actor.{Actor, Props, ActorRef}

object CentreActor {
  case class Info(x: String, agent: ActorRef)
  case class Hello(msg: String)
  
  def props(): Props = Props(new CentreActor)
}

class CentreActor extends Actor {
  import CentreActor._
  
  def receive: Receive = {
    case Info(x,aref) => println(x); aref ! Hello("call Agent") 
//    case Hello(m) => sender() ! Hello("This is Centre, COPY!")
    case _ => {
      println("Not Support!")
      println("sender: " + sender().path)
    }
  }
}