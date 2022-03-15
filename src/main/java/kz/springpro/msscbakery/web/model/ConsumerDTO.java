package kz.springpro.msscbakery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumerDTO {
    private UUID id;
    private String fullName;
    private String companyName;
}
