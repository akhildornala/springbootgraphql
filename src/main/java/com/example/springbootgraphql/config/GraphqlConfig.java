package com.example.springbootgraphql.config;

import graphql.scalars.ExtendedScalars;
import graphql.validation.rules.OnValidationErrorStrategy;
import graphql.validation.rules.ValidationRules;
import graphql.validation.schemawiring.ValidationSchemaWiring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphqlConfig {

    @Bean
    RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return builder -> builder.scalar(ExtendedScalars.Date)
                .scalar(ExtendedScalars.DateTime)
                .directiveWiring(validationSchemaWiring());
    }

    ValidationSchemaWiring validationSchemaWiring() {
        ValidationRules validationRules = ValidationRules.newValidationRules().onValidationErrorStrategy(OnValidationErrorStrategy.RETURN_NULL)
                .build();
        return new ValidationSchemaWiring(validationRules);
    }
}
