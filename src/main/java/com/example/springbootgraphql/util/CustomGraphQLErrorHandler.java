package com.example.springbootgraphql.util;

import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

//@Component
//public class CustomGraphQLErrorHandler extends DataFetcherExceptionResolverAdapter {
//public class CustomGraphQLErrorHandler {
/*
    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        return GraphqlErrorBuilder.newError(env)
                .message(ex.getMessage())
                .errorType(ErrorType.BAD_REQUEST)
                .build();
    }

 */
//}




