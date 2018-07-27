package example

import akka.actor.{ActorSystem, Actor, ActorRef, Props}
import akka.serialization.Serialization
import com.typesafe.config.ConfigFactory

object App1 {
  
  def main(args: Array[String]): Unit = {
   
    val cfg = ConfigFactory.load().getConfig("App1")
    
//    println(cfg.root().render())
    val actorSys = ActorSystem("app1-akka-sys", cfg)
    val centreActor = actorSys.actorOf(CentreActor.props(), "centre-actor")
    val agentActor = actorSys.actorOf(Props[AgentActor], "agent1")
    
    println("1. centreActor.toString: " + centreActor.toString())
    println("2. centreActor.path: " + centreActor.path)
    println("3. centreActor.path.address: " + centreActor.path.address)
    println("4. " + Serialization.serializedActorPath(centreActor))
    println("5. " + Serialization.serializedActorPath(agentActor))
    
    centreActor ! CentreActor.Info("Go", agentActor)
 

//    Thread.sleep(10000)
//    if (!Thread.currentThread().isInterrupted()) Thread.sleep(1000)
  }
}