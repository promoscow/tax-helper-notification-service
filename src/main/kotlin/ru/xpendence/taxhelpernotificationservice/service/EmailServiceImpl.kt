package ru.xpendence.taxhelpernotificationservice.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import ru.xpendence.taxhelpernotificationservice.dto.EmailMessageDto
import ru.xpendence.taxhelpernotificationservice.dto.ResponseDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 27.07.19
 * Time: 18:47
 * e-mail: v.chernyshov@pflb.ru
 */
@Service
@Profile(value = ["!h2-mock"])
class EmailServiceImpl : EmailService {

    @Autowired
    lateinit var sender: JavaMailSender

    @Autowired
    lateinit var objectMapper: ObjectMapper

    override fun send(dto: EmailMessageDto): ResponseDto {
        val message = SimpleMailMessage()
        fillMessage(dto, message)
        sender.send(message)
        return ResponseDto(objectMapper.writeValueAsString(message))
    }

    fun fillMessage(dto: EmailMessageDto, message: SimpleMailMessage) {
        message.setTo(dto.to!!)
        message.setFrom(dto.from!!)
        message.setSubject(dto.subject!!)
        message.setText(dto.text!!)
    }
}