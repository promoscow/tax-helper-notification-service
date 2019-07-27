package ru.xpendence.taxhelpernotificationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@SpringBootApplication
@PropertySources(value = [PropertySource(value = ["classpath:mail.properties"])])
class TaxHelperNotificationServiceApplication

fun main(args: Array<String>) {
    runApplication<TaxHelperNotificationServiceApplication>(*args)
}
