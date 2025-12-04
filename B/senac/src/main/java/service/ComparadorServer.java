package service;

import dto.ValoresDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class ComparadorServer {

    @RabbitListener(queues = "provac2IgorTalon")
    public String processarComparacao(ValoresDTO dto) {
        double maior = dto.getA() > dto.getB() ? dto.getA() : dto.getB();
        return String.valueOf(maior);
    }
}