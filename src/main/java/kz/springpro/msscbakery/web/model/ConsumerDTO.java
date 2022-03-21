package kz.springpro.msscbakery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConsumerDTO {
    private UUID id;
    private String fullName;
    private String companyName;



}
