package io.jschneider.graphql.gremlin;

import io.jschneider.graphql.gremlin.directive.GraphQLDirective;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Data
public class GraphQLField {
    final @NonNull String fieldName;
    final @NonNull String fieldAlias;

    /**
     * An alias specified in the query itself, e.g.:
     * {
     *   user(id: 4) {
     *     name: fullName
     *   }
     * }
     *
     * name is the alias, fullName is the fieldName, fullName0 is the fieldAlias for the traversal
     */
    final String queryAlias;

    List<GraphQLDirective> directives = new ArrayList<GraphQLDirective>();
}
