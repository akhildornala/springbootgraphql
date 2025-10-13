//package com.example.springbootgraphql.util;
//
//import graphql.GraphQLError;
//import graphql.GraphqlErrorBuilder;
//import graphql.schema.DataFetchingEnvironment;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
//
//@Configuration
//public class GraphQLErrorConfig {
//
//    @Bean
//    public DataFetcherExceptionResolverAdapter dataFetcherExceptionResolver() {
//        return new DataFetcherExceptionResolverAdapter() {
//            protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
//                return GraphqlErrorBuilder.newError(env)
//                        .message("Custom error: " + ex.getMessage())
//                        .build();
//            }
//        };
//    }
//}
//
//
