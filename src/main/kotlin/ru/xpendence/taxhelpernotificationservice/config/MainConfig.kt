package ru.xpendence.taxhelpernotificationservice.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl
import java.nio.charset.StandardCharsets

/**
 * Author: Vyacheslav Chernyshov
 * Date: 27.07.19
 * Time: 18:33
 * e-mail: v.chernyshov@pflb.ru
 */
@Configuration
class MainConfig {

    @Value("\${mail.host}")
    private val host: String? = null

    @Value("\${mail.port}")
    private val port: String? = null

    @Value("\${mail.username}")
    private val username: String? = null

    @Value("\${mail.password}")
    private val password: String? = null

    @Value("\${mail.protocol}")
    private val protocol: String? = null

    @Value("\${mail.smtps.auth}")
    private val auth: String? = null

    @Value("\${mail.debug}")
    private val debug: Boolean = false

    @Value("\${mail.smtp.starttls.enable}")
    private val starttls: Boolean = false

    @Bean
    fun getJavaMailSender(): JavaMailSender {
        val mailSender = JavaMailSenderImpl()

        mailSender.host = host
        mailSender.port = Integer.parseInt(port)
        mailSender.protocol = protocol

        mailSender.username = username
        mailSender.password = password
        mailSender.defaultEncoding = StandardCharsets.UTF_8.name()

        val props = mailSender.javaMailProperties
        props["mail.transport.protocol"] = "smtp"
        props["mail.smtp.auth"] = "true"
        props["mail.smtp.starttls.enable"] = "true"
        props["mail.debug"] = "true"

        return mailSender
    }

    @Bean
    fun objectMapper(): ObjectMapper = ObjectMapper()
}