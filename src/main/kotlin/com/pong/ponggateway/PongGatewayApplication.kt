package com.pong.ponggateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PongGatewayApplication

fun main(args: Array<String>) {
	runApplication<PongGatewayApplication>(*args)
}
