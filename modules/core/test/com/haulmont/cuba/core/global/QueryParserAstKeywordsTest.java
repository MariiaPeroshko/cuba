/*
 * Copyright (c) 2008-2019 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.cuba.core.global;

import com.haulmont.cuba.core.sys.jpql.AntlrNoCaseStringStream;
import com.haulmont.cuba.core.sys.jpql.DomainModel;
import com.haulmont.cuba.core.sys.jpql.JpqlSyntaxException;
import com.haulmont.cuba.core.sys.jpql.antlr4.JPA2Lexer;
import com.haulmont.cuba.core.sys.jpql.antlr4.JPA2Parser;
import com.haulmont.cuba.core.sys.jpql.model.EntityBuilder;
import com.haulmont.cuba.core.sys.jpql.model.JpqlEntityModel;
import com.haulmont.cuba.core.sys.jpql.transform.QueryTransformerAstBased;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.junit.Test;

import java.io.StringReader;
import java.util.Set;

import static org.junit.Assert.*;

public class QueryParserAstKeywordsTest {

    @Test
    public void testMainEntity() {
        DomainModel model = prepareDomainModel();
        QueryParserAstBased parser = new QueryParserAstBased(model,
                "select e from test_Entity e where e.set = :par"
        );

        assertEquals("test_Entity", parser.getEntityName());
    }


    @Test
    public void testSet() {
        JPA2Lexer lexer = new JPA2Lexer(CharStreams.fromString("select e from test_Entity e where e.name = :par".toUpperCase()));
        JPA2Parser parser = new JPA2Parser(new BufferedTokenStream(lexer));
        JPA2Parser.Ql_statementContext aReturn = parser.ql_statement();
    }

    private DomainModel prepareDomainModel() {
        EntityBuilder builder = new EntityBuilder();
        builder.startNewEntity("test_Entity");
        builder.addStringAttribute("set");
        builder.addStringAttribute("createdBy");
        JpqlEntityModel testEntity = builder.produce();

        return new DomainModel(testEntity);
    }
}
