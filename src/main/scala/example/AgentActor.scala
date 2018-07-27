package example

import akka.actor.{Actor,Props}

object AgentActor {
  
  def props(): Props = Props(new AgentActor)
}

class AgentActor extends Actor {
  
  
  println("AgentActor: being created")
  def receive: Receive = {
    case _ => println("in-coming message(?)"); println(self.path.address)
  }
}