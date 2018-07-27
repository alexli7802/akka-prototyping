package example

import akka.actor.{ActorSystem, Actor, ActorRef}
import akka.serialization.Serialization
import com.typesafe.config.ConfigFactory
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.ExecutionContext.Implicits.global 

object App2 {
  
  def main(args: Array[String]): Unit = {

    val cfg = ConfigFactory.load().getConfig("App2")
    val actorSys = ActorSystem("app2-akka-sys", cfg)

//    val fa = actorSys.actorSelection(args(0)).resolveOne(FiniteDuration(5, "seconds"))
//    
//    fa.foreach { a => 
//      println("Here we are")
//      a ! "Try this"
//      a ! CentreActor.Hello("Hi, This is Agent-App2") 
//    }
    
  }
}