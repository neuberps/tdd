package com.ms.tdd.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Builder
@Document(collection = "client")
public class Client {
    @Id
    private String id;
    private String name;
    private String email;
    private String cel;
    private String cpf;
    private String created;
    private String updated;
    private String user;
}
