package com.rabbitmqpublisher.rabbitmqpublisherdemo;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class SimpleMessage implements Serializable {
    private String name;
    private String description;
}