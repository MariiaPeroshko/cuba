// Generated from JPA2.g by ANTLR 4.7.2

package com.haulmont.cuba.core.sys.jpql.antlr4;

import com.haulmont.cuba.core.sys.jpql.tree.QueryNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectedItemNode;
import com.haulmont.cuba.core.sys.jpql.tree.PathNode;
import com.haulmont.cuba.core.sys.jpql.tree.FromNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectionSourceNode;
import com.haulmont.cuba.core.sys.jpql.tree.IdentificationVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.JoinVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.CollectionMemberNode;
import com.haulmont.cuba.core.sys.jpql.tree.WhereNode;
import com.haulmont.cuba.core.sys.jpql.tree.SimpleConditionNode;
import com.haulmont.cuba.core.sys.jpql.tree.ParameterNode;
import com.haulmont.cuba.core.sys.jpql.tree.GroupByNode;
import com.haulmont.cuba.core.sys.jpql.tree.OrderByNode;
import com.haulmont.cuba.core.sys.jpql.tree.OrderByFieldNode;
import com.haulmont.cuba.core.sys.jpql.tree.AggregateExpressionNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectedItemsNode;
import com.haulmont.cuba.core.sys.jpql.tree.UpdateSetNode;
import com.haulmont.cuba.core.sys.jpql.tree.EnumConditionNode;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JPA2Parser}.
 */
public interface JPA2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#ql_statement}.
	 * @param ctx the parse tree
	 */
	void enterQl_statement(JPA2Parser.Ql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#ql_statement}.
	 * @param ctx the parse tree
	 */
	void exitQl_statement(JPA2Parser.Ql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(JPA2Parser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(JPA2Parser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(JPA2Parser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(JPA2Parser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(JPA2Parser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(JPA2Parser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(JPA2Parser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(JPA2Parser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#identification_variable_declaration_or_collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIdentification_variable_declaration_or_collection_member_declaration(JPA2Parser.Identification_variable_declaration_or_collection_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#identification_variable_declaration_or_collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIdentification_variable_declaration_or_collection_member_declaration(JPA2Parser.Identification_variable_declaration_or_collection_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIdentification_variable_declaration(JPA2Parser.Identification_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIdentification_variable_declaration(JPA2Parser.Identification_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#join_section}.
	 * @param ctx the parse tree
	 */
	void enterJoin_section(JPA2Parser.Join_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#join_section}.
	 * @param ctx the parse tree
	 */
	void exitJoin_section(JPA2Parser.Join_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#joined_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoined_clause(JPA2Parser.Joined_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#joined_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoined_clause(JPA2Parser.Joined_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#range_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRange_variable_declaration(JPA2Parser.Range_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#range_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRange_variable_declaration(JPA2Parser.Range_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(JPA2Parser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(JPA2Parser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#fetch_join}.
	 * @param ctx the parse tree
	 */
	void enterFetch_join(JPA2Parser.Fetch_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#fetch_join}.
	 * @param ctx the parse tree
	 */
	void exitFetch_join(JPA2Parser.Fetch_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#join_spec}.
	 * @param ctx the parse tree
	 */
	void enterJoin_spec(JPA2Parser.Join_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#join_spec}.
	 * @param ctx the parse tree
	 */
	void exitJoin_spec(JPA2Parser.Join_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#join_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_association_path_expression(JPA2Parser.Join_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#join_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_association_path_expression(JPA2Parser.Join_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCollection_member_declaration(JPA2Parser.Collection_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCollection_member_declaration(JPA2Parser.Collection_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#qualified_identification_variable}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identification_variable(JPA2Parser.Qualified_identification_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#qualified_identification_variable}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identification_variable(JPA2Parser.Qualified_identification_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#map_field_identification_variable}.
	 * @param ctx the parse tree
	 */
	void enterMap_field_identification_variable(JPA2Parser.Map_field_identification_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#map_field_identification_variable}.
	 * @param ctx the parse tree
	 */
	void exitMap_field_identification_variable(JPA2Parser.Map_field_identification_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#path_expression}.
	 * @param ctx the parse tree
	 */
	void enterPath_expression(JPA2Parser.Path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#path_expression}.
	 * @param ctx the parse tree
	 */
	void exitPath_expression(JPA2Parser.Path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#general_identification_variable}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_identification_variable(JPA2Parser.General_identification_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#general_identification_variable}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_identification_variable(JPA2Parser.General_identification_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#update_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_clause(JPA2Parser.Update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#update_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_clause(JPA2Parser.Update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#update_item}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_item(JPA2Parser.Update_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#update_item}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_item(JPA2Parser.Update_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#new_value}.
	 * @param ctx the parse tree
	 */
	void enterNew_value(JPA2Parser.New_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#new_value}.
	 * @param ctx the parse tree
	 */
	void exitNew_value(JPA2Parser.New_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#delete_clause}.
	 * @param ctx the parse tree
	 */
	void enterDelete_clause(JPA2Parser.Delete_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#delete_clause}.
	 * @param ctx the parse tree
	 */
	void exitDelete_clause(JPA2Parser.Delete_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(JPA2Parser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(JPA2Parser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#select_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_item(JPA2Parser.Select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#select_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_item(JPA2Parser.Select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(JPA2Parser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(JPA2Parser.Select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(JPA2Parser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(JPA2Parser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#constructor_item}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_item(JPA2Parser.Constructor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#constructor_item}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_item(JPA2Parser.Constructor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#aggregate_expression}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_expression(JPA2Parser.Aggregate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#aggregate_expression}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_expression(JPA2Parser.Aggregate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#aggregate_expression_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_expression_function_name(JPA2Parser.Aggregate_expression_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#aggregate_expression_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_expression_function_name(JPA2Parser.Aggregate_expression_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#count_argument}.
	 * @param ctx the parse tree
	 */
	void enterCount_argument(JPA2Parser.Count_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#count_argument}.
	 * @param ctx the parse tree
	 */
	void exitCount_argument(JPA2Parser.Count_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(JPA2Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(JPA2Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(JPA2Parser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(JPA2Parser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(JPA2Parser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(JPA2Parser.Groupby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(JPA2Parser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(JPA2Parser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(JPA2Parser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(JPA2Parser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_item(JPA2Parser.Orderby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_item(JPA2Parser.Orderby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#orderby_variable}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_variable(JPA2Parser.Orderby_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#orderby_variable}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_variable(JPA2Parser.Orderby_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(JPA2Parser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(JPA2Parser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#sortNulls}.
	 * @param ctx the parse tree
	 */
	void enterSortNulls(JPA2Parser.SortNullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#sortNulls}.
	 * @param ctx the parse tree
	 */
	void exitSortNulls(JPA2Parser.SortNullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(JPA2Parser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(JPA2Parser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#subquery_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_from_clause(JPA2Parser.Subquery_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#subquery_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_from_clause(JPA2Parser.Subquery_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_identification_variable_declaration(JPA2Parser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_identification_variable_declaration(JPA2Parser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#derived_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterDerived_path_expression(JPA2Parser.Derived_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#derived_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitDerived_path_expression(JPA2Parser.Derived_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#general_derived_path}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_derived_path(JPA2Parser.General_derived_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#general_derived_path}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_derived_path(JPA2Parser.General_derived_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_derived_path}.
	 * @param ctx the parse tree
	 */
	void enterSimple_derived_path(JPA2Parser.Simple_derived_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_derived_path}.
	 * @param ctx the parse tree
	 */
	void exitSimple_derived_path(JPA2Parser.Simple_derived_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#treated_derived_path}.
	 * @param ctx the parse tree
	 */
	void enterTreated_derived_path(JPA2Parser.Treated_derived_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#treated_derived_path}.
	 * @param ctx the parse tree
	 */
	void exitTreated_derived_path(JPA2Parser.Treated_derived_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#derived_collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDerived_collection_member_declaration(JPA2Parser.Derived_collection_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#derived_collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDerived_collection_member_declaration(JPA2Parser.Derived_collection_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_clause(JPA2Parser.Simple_select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_clause(JPA2Parser.Simple_select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_expression(JPA2Parser.Simple_select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_expression(JPA2Parser.Simple_select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#scalar_expression}.
	 * @param ctx the parse tree
	 */
	void enterScalar_expression(JPA2Parser.Scalar_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#scalar_expression}.
	 * @param ctx the parse tree
	 */
	void exitScalar_expression(JPA2Parser.Scalar_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(JPA2Parser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(JPA2Parser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#conditional_term}.
	 * @param ctx the parse tree
	 */
	void enterConditional_term(JPA2Parser.Conditional_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#conditional_term}.
	 * @param ctx the parse tree
	 */
	void exitConditional_term(JPA2Parser.Conditional_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void enterConditional_factor(JPA2Parser.Conditional_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void exitConditional_factor(JPA2Parser.Conditional_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#conditional_primary}.
	 * @param ctx the parse tree
	 */
	void enterConditional_primary(JPA2Parser.Conditional_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#conditional_primary}.
	 * @param ctx the parse tree
	 */
	void exitConditional_primary(JPA2Parser.Conditional_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_cond_expression(JPA2Parser.Simple_cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_cond_expression(JPA2Parser.Simple_cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_macro_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_macro_expression(JPA2Parser.Date_macro_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_macro_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_macro_expression(JPA2Parser.Date_macro_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_between_macro_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_between_macro_expression(JPA2Parser.Date_between_macro_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_between_macro_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_between_macro_expression(JPA2Parser.Date_between_macro_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_before_macro_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_before_macro_expression(JPA2Parser.Date_before_macro_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_before_macro_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_before_macro_expression(JPA2Parser.Date_before_macro_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_after_macro_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_after_macro_expression(JPA2Parser.Date_after_macro_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_after_macro_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_after_macro_expression(JPA2Parser.Date_after_macro_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_equals_macro_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_equals_macro_expression(JPA2Parser.Date_equals_macro_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_equals_macro_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_equals_macro_expression(JPA2Parser.Date_equals_macro_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_today_macro_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_today_macro_expression(JPA2Parser.Date_today_macro_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_today_macro_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_today_macro_expression(JPA2Parser.Date_today_macro_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#between_expression}.
	 * @param ctx the parse tree
	 */
	void enterBetween_expression(JPA2Parser.Between_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#between_expression}.
	 * @param ctx the parse tree
	 */
	void exitBetween_expression(JPA2Parser.Between_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#in_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_expression(JPA2Parser.In_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#in_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_expression(JPA2Parser.In_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#in_item}.
	 * @param ctx the parse tree
	 */
	void enterIn_item(JPA2Parser.In_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#in_item}.
	 * @param ctx the parse tree
	 */
	void exitIn_item(JPA2Parser.In_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#like_expression}.
	 * @param ctx the parse tree
	 */
	void enterLike_expression(JPA2Parser.Like_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#like_expression}.
	 * @param ctx the parse tree
	 */
	void exitLike_expression(JPA2Parser.Like_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#null_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_comparison_expression(JPA2Parser.Null_comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#null_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_comparison_expression(JPA2Parser.Null_comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_collection_comparison_expression(JPA2Parser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_collection_comparison_expression(JPA2Parser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#collection_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_member_expression(JPA2Parser.Collection_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#collection_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_member_expression(JPA2Parser.Collection_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#entity_or_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterEntity_or_value_expression(JPA2Parser.Entity_or_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#entity_or_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitEntity_or_value_expression(JPA2Parser.Entity_or_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_entity_or_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_entity_or_value_expression(JPA2Parser.Simple_entity_or_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_entity_or_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_entity_or_value_expression(JPA2Parser.Simple_entity_or_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#exists_expression}.
	 * @param ctx the parse tree
	 */
	void enterExists_expression(JPA2Parser.Exists_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#exists_expression}.
	 * @param ctx the parse tree
	 */
	void exitExists_expression(JPA2Parser.Exists_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#all_or_any_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_or_any_expression(JPA2Parser.All_or_any_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#all_or_any_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_or_any_expression(JPA2Parser.All_or_any_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(JPA2Parser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(JPA2Parser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(JPA2Parser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(JPA2Parser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(JPA2Parser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(JPA2Parser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_term(JPA2Parser.Arithmetic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_term(JPA2Parser.Arithmetic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_factor(JPA2Parser.Arithmetic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_factor(JPA2Parser.Arithmetic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#arithmetic_primary}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_primary(JPA2Parser.Arithmetic_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#arithmetic_primary}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_primary(JPA2Parser.Arithmetic_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(JPA2Parser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(JPA2Parser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(JPA2Parser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(JPA2Parser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(JPA2Parser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(JPA2Parser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#enum_expression}.
	 * @param ctx the parse tree
	 */
	void enterEnum_expression(JPA2Parser.Enum_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#enum_expression}.
	 * @param ctx the parse tree
	 */
	void exitEnum_expression(JPA2Parser.Enum_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#entity_expression}.
	 * @param ctx the parse tree
	 */
	void enterEntity_expression(JPA2Parser.Entity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#entity_expression}.
	 * @param ctx the parse tree
	 */
	void exitEntity_expression(JPA2Parser.Entity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_entity_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_entity_expression(JPA2Parser.Simple_entity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_entity_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_entity_expression(JPA2Parser.Simple_entity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#entity_type_expression}.
	 * @param ctx the parse tree
	 */
	void enterEntity_type_expression(JPA2Parser.Entity_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#entity_type_expression}.
	 * @param ctx the parse tree
	 */
	void exitEntity_type_expression(JPA2Parser.Entity_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#type_discriminator}.
	 * @param ctx the parse tree
	 */
	void enterType_discriminator(JPA2Parser.Type_discriminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#type_discriminator}.
	 * @param ctx the parse tree
	 */
	void exitType_discriminator(JPA2Parser.Type_discriminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_numerics(JPA2Parser.Functions_returning_numericsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_numerics(JPA2Parser.Functions_returning_numericsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_datetime(JPA2Parser.Functions_returning_datetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_datetime(JPA2Parser.Functions_returning_datetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#functions_returning_strings}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_strings(JPA2Parser.Functions_returning_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#functions_returning_strings}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_strings(JPA2Parser.Functions_returning_stringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void enterTrim_specification(JPA2Parser.Trim_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void exitTrim_specification(JPA2Parser.Trim_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#function_invocation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_invocation(JPA2Parser.Function_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#function_invocation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_invocation(JPA2Parser.Function_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#function_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arg(JPA2Parser.Function_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#function_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arg(JPA2Parser.Function_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(JPA2Parser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(JPA2Parser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#general_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_case_expression(JPA2Parser.General_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#general_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_case_expression(JPA2Parser.General_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(JPA2Parser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(JPA2Parser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_expression(JPA2Parser.Simple_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_expression(JPA2Parser.Simple_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#case_operand}.
	 * @param ctx the parse tree
	 */
	void enterCase_operand(JPA2Parser.Case_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#case_operand}.
	 * @param ctx the parse tree
	 */
	void exitCase_operand(JPA2Parser.Case_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#simple_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterSimple_when_clause(JPA2Parser.Simple_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#simple_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitSimple_when_clause(JPA2Parser.Simple_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#coalesce_expression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesce_expression(JPA2Parser.Coalesce_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#coalesce_expression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesce_expression(JPA2Parser.Coalesce_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#nullif_expression}.
	 * @param ctx the parse tree
	 */
	void enterNullif_expression(JPA2Parser.Nullif_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#nullif_expression}.
	 * @param ctx the parse tree
	 */
	void exitNullif_expression(JPA2Parser.Nullif_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#extension_functions}.
	 * @param ctx the parse tree
	 */
	void enterExtension_functions(JPA2Parser.Extension_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#extension_functions}.
	 * @param ctx the parse tree
	 */
	void exitExtension_functions(JPA2Parser.Extension_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#extract_function}.
	 * @param ctx the parse tree
	 */
	void enterExtract_function(JPA2Parser.Extract_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#extract_function}.
	 * @param ctx the parse tree
	 */
	void exitExtract_function(JPA2Parser.Extract_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#enum_function}.
	 * @param ctx the parse tree
	 */
	void enterEnum_function(JPA2Parser.Enum_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#enum_function}.
	 * @param ctx the parse tree
	 */
	void exitEnum_function(JPA2Parser.Enum_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_part}.
	 * @param ctx the parse tree
	 */
	void enterDate_part(JPA2Parser.Date_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_part}.
	 * @param ctx the parse tree
	 */
	void exitDate_part(JPA2Parser.Date_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#input_parameter}.
	 * @param ctx the parse tree
	 */
	void enterInput_parameter(JPA2Parser.Input_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#input_parameter}.
	 * @param ctx the parse tree
	 */
	void exitInput_parameter(JPA2Parser.Input_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JPA2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JPA2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_name(JPA2Parser.Constructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_name(JPA2Parser.Constructor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#enum_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnum_literal(JPA2Parser.Enum_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#enum_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnum_literal(JPA2Parser.Enum_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(JPA2Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(JPA2Parser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JPA2Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JPA2Parser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#identification_variable}.
	 * @param ctx the parse tree
	 */
	void enterIdentification_variable(JPA2Parser.Identification_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#identification_variable}.
	 * @param ctx the parse tree
	 */
	void exitIdentification_variable(JPA2Parser.Identification_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(JPA2Parser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(JPA2Parser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#escape_character}.
	 * @param ctx the parse tree
	 */
	void enterEscape_character(JPA2Parser.Escape_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#escape_character}.
	 * @param ctx the parse tree
	 */
	void exitEscape_character(JPA2Parser.Escape_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#trim_character}.
	 * @param ctx the parse tree
	 */
	void enterTrim_character(JPA2Parser.Trim_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#trim_character}.
	 * @param ctx the parse tree
	 */
	void exitTrim_character(JPA2Parser.Trim_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(JPA2Parser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(JPA2Parser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(JPA2Parser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(JPA2Parser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_literal(JPA2Parser.Decimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_literal(JPA2Parser.Decimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#single_valued_object_field}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_object_field(JPA2Parser.Single_valued_object_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#single_valued_object_field}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_object_field(JPA2Parser.Single_valued_object_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#single_valued_embeddable_object_field}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_embeddable_object_field(JPA2Parser.Single_valued_embeddable_object_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#single_valued_embeddable_object_field}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_embeddable_object_field(JPA2Parser.Single_valued_embeddable_object_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#collection_valued_field}.
	 * @param ctx the parse tree
	 */
	void enterCollection_valued_field(JPA2Parser.Collection_valued_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#collection_valued_field}.
	 * @param ctx the parse tree
	 */
	void exitCollection_valued_field(JPA2Parser.Collection_valued_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#entity_name}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name(JPA2Parser.Entity_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#entity_name}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name(JPA2Parser.Entity_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#subtype}.
	 * @param ctx the parse tree
	 */
	void enterSubtype(JPA2Parser.SubtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#subtype}.
	 * @param ctx the parse tree
	 */
	void exitSubtype(JPA2Parser.SubtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#entity_type_literal}.
	 * @param ctx the parse tree
	 */
	void enterEntity_type_literal(JPA2Parser.Entity_type_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#entity_type_literal}.
	 * @param ctx the parse tree
	 */
	void exitEntity_type_literal(JPA2Parser.Entity_type_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(JPA2Parser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(JPA2Parser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#state_field}.
	 * @param ctx the parse tree
	 */
	void enterState_field(JPA2Parser.State_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#state_field}.
	 * @param ctx the parse tree
	 */
	void exitState_field(JPA2Parser.State_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#result_variable}.
	 * @param ctx the parse tree
	 */
	void enterResult_variable(JPA2Parser.Result_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#result_variable}.
	 * @param ctx the parse tree
	 */
	void exitResult_variable(JPA2Parser.Result_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#superquery_identification_variable}.
	 * @param ctx the parse tree
	 */
	void enterSuperquery_identification_variable(JPA2Parser.Superquery_identification_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#superquery_identification_variable}.
	 * @param ctx the parse tree
	 */
	void exitSuperquery_identification_variable(JPA2Parser.Superquery_identification_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#date_time_timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_timestamp_literal(JPA2Parser.Date_time_timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#date_time_timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_timestamp_literal(JPA2Parser.Date_time_timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#pattern_value}.
	 * @param ctx the parse tree
	 */
	void enterPattern_value(JPA2Parser.Pattern_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#pattern_value}.
	 * @param ctx the parse tree
	 */
	void exitPattern_value(JPA2Parser.Pattern_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#collection_valued_input_parameter}.
	 * @param ctx the parse tree
	 */
	void enterCollection_valued_input_parameter(JPA2Parser.Collection_valued_input_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#collection_valued_input_parameter}.
	 * @param ctx the parse tree
	 */
	void exitCollection_valued_input_parameter(JPA2Parser.Collection_valued_input_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#single_valued_input_parameter}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_input_parameter(JPA2Parser.Single_valued_input_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#single_valued_input_parameter}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_input_parameter(JPA2Parser.Single_valued_input_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPA2Parser#enum_value_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnum_value_literal(JPA2Parser.Enum_value_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPA2Parser#enum_value_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnum_value_literal(JPA2Parser.Enum_value_literalContext ctx);
}