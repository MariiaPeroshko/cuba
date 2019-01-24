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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JPA2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, NOT=113, IN=114, 
		TRIM_CHARACTER=115, STRING_LITERAL=116, WORD=117, RUSSIAN_SYMBOLS=118, 
		NAMED_PARAMETER=119, WS=120, COMMENT=121, LINE_COMMENT=122, ESCAPE_CHARACTER=123, 
		INT_NUMERAL=124, LPAREN=125, RPAREN=126, T_SELECTED_ITEMS=127, T_SELECTED_ITEM=128, 
		T_SOURCES=129, T_SOURCE=130, T_SELECTED_FIELD=131, T_SELECTED_ENTITY=132, 
		T_ID_VAR=133, T_JOIN_VAR=134, T_COLLECTION_MEMBER=135, T_QUERY=136, T_CONDITION=137, 
		T_SIMPLE_CONDITION=138, T_PARAMETER=139, T_GROUP_BY=140, T_ORDER_BY=141, 
		T_ORDER_BY_FIELD=142, T_AGGREGATE_EXPR=143, T_ENUM_MACROS=144;
	public static final int
		RULE_ql_statement = 0, RULE_select_statement = 1, RULE_update_statement = 2, 
		RULE_delete_statement = 3, RULE_from_clause = 4, RULE_identification_variable_declaration_or_collection_member_declaration = 5, 
		RULE_identification_variable_declaration = 6, RULE_join_section = 7, RULE_joined_clause = 8, 
		RULE_range_variable_declaration = 9, RULE_join = 10, RULE_fetch_join = 11, 
		RULE_join_spec = 12, RULE_join_association_path_expression = 13, RULE_collection_member_declaration = 14, 
		RULE_qualified_identification_variable = 15, RULE_map_field_identification_variable = 16, 
		RULE_path_expression = 17, RULE_general_identification_variable = 18, 
		RULE_update_clause = 19, RULE_update_item = 20, RULE_new_value = 21, RULE_delete_clause = 22, 
		RULE_select_clause = 23, RULE_select_item = 24, RULE_select_expression = 25, 
		RULE_constructor_expression = 26, RULE_constructor_item = 27, RULE_aggregate_expression = 28, 
		RULE_aggregate_expression_function_name = 29, RULE_count_argument = 30, 
		RULE_where_clause = 31, RULE_groupby_clause = 32, RULE_groupby_item = 33, 
		RULE_having_clause = 34, RULE_orderby_clause = 35, RULE_orderby_item = 36, 
		RULE_orderby_variable = 37, RULE_sort = 38, RULE_sortNulls = 39, RULE_subquery = 40, 
		RULE_subquery_from_clause = 41, RULE_subselect_identification_variable_declaration = 42, 
		RULE_derived_path_expression = 43, RULE_general_derived_path = 44, RULE_simple_derived_path = 45, 
		RULE_treated_derived_path = 46, RULE_derived_collection_member_declaration = 47, 
		RULE_simple_select_clause = 48, RULE_simple_select_expression = 49, RULE_scalar_expression = 50, 
		RULE_conditional_expression = 51, RULE_conditional_term = 52, RULE_conditional_factor = 53, 
		RULE_conditional_primary = 54, RULE_simple_cond_expression = 55, RULE_date_macro_expression = 56, 
		RULE_date_between_macro_expression = 57, RULE_date_before_macro_expression = 58, 
		RULE_date_after_macro_expression = 59, RULE_date_equals_macro_expression = 60, 
		RULE_date_today_macro_expression = 61, RULE_between_expression = 62, RULE_in_expression = 63, 
		RULE_in_item = 64, RULE_like_expression = 65, RULE_null_comparison_expression = 66, 
		RULE_empty_collection_comparison_expression = 67, RULE_collection_member_expression = 68, 
		RULE_entity_or_value_expression = 69, RULE_simple_entity_or_value_expression = 70, 
		RULE_exists_expression = 71, RULE_all_or_any_expression = 72, RULE_comparison_expression = 73, 
		RULE_comparison_operator = 74, RULE_arithmetic_expression = 75, RULE_arithmetic_term = 76, 
		RULE_arithmetic_factor = 77, RULE_arithmetic_primary = 78, RULE_string_expression = 79, 
		RULE_datetime_expression = 80, RULE_boolean_expression = 81, RULE_enum_expression = 82, 
		RULE_entity_expression = 83, RULE_simple_entity_expression = 84, RULE_entity_type_expression = 85, 
		RULE_type_discriminator = 86, RULE_functions_returning_numerics = 87, 
		RULE_functions_returning_datetime = 88, RULE_functions_returning_strings = 89, 
		RULE_trim_specification = 90, RULE_function_invocation = 91, RULE_function_arg = 92, 
		RULE_case_expression = 93, RULE_general_case_expression = 94, RULE_when_clause = 95, 
		RULE_simple_case_expression = 96, RULE_case_operand = 97, RULE_simple_when_clause = 98, 
		RULE_coalesce_expression = 99, RULE_nullif_expression = 100, RULE_extension_functions = 101, 
		RULE_extract_function = 102, RULE_enum_function = 103, RULE_date_part = 104, 
		RULE_input_parameter = 105, RULE_literal = 106, RULE_constructor_name = 107, 
		RULE_enum_literal = 108, RULE_boolean_literal = 109, RULE_field = 110, 
		RULE_identification_variable = 111, RULE_parameter_name = 112, RULE_escape_character = 113, 
		RULE_trim_character = 114, RULE_string_literal = 115, RULE_numeric_literal = 116, 
		RULE_decimal_literal = 117, RULE_single_valued_object_field = 118, RULE_single_valued_embeddable_object_field = 119, 
		RULE_collection_valued_field = 120, RULE_entity_name = 121, RULE_subtype = 122, 
		RULE_entity_type_literal = 123, RULE_function_name = 124, RULE_state_field = 125, 
		RULE_result_variable = 126, RULE_superquery_identification_variable = 127, 
		RULE_date_time_timestamp_literal = 128, RULE_pattern_value = 129, RULE_collection_valued_input_parameter = 130, 
		RULE_single_valued_input_parameter = 131, RULE_enum_value_literal = 132;
	private static String[] makeRuleNames() {
		return new String[] {
			"ql_statement", "select_statement", "update_statement", "delete_statement", 
			"from_clause", "identification_variable_declaration_or_collection_member_declaration", 
			"identification_variable_declaration", "join_section", "joined_clause", 
			"range_variable_declaration", "join", "fetch_join", "join_spec", "join_association_path_expression", 
			"collection_member_declaration", "qualified_identification_variable", 
			"map_field_identification_variable", "path_expression", "general_identification_variable", 
			"update_clause", "update_item", "new_value", "delete_clause", "select_clause", 
			"select_item", "select_expression", "constructor_expression", "constructor_item", 
			"aggregate_expression", "aggregate_expression_function_name", "count_argument", 
			"where_clause", "groupby_clause", "groupby_item", "having_clause", "orderby_clause", 
			"orderby_item", "orderby_variable", "sort", "sortNulls", "subquery", 
			"subquery_from_clause", "subselect_identification_variable_declaration", 
			"derived_path_expression", "general_derived_path", "simple_derived_path", 
			"treated_derived_path", "derived_collection_member_declaration", "simple_select_clause", 
			"simple_select_expression", "scalar_expression", "conditional_expression", 
			"conditional_term", "conditional_factor", "conditional_primary", "simple_cond_expression", 
			"date_macro_expression", "date_between_macro_expression", "date_before_macro_expression", 
			"date_after_macro_expression", "date_equals_macro_expression", "date_today_macro_expression", 
			"between_expression", "in_expression", "in_item", "like_expression", 
			"null_comparison_expression", "empty_collection_comparison_expression", 
			"collection_member_expression", "entity_or_value_expression", "simple_entity_or_value_expression", 
			"exists_expression", "all_or_any_expression", "comparison_expression", 
			"comparison_operator", "arithmetic_expression", "arithmetic_term", "arithmetic_factor", 
			"arithmetic_primary", "string_expression", "datetime_expression", "boolean_expression", 
			"enum_expression", "entity_expression", "simple_entity_expression", "entity_type_expression", 
			"type_discriminator", "functions_returning_numerics", "functions_returning_datetime", 
			"functions_returning_strings", "trim_specification", "function_invocation", 
			"function_arg", "case_expression", "general_case_expression", "when_clause", 
			"simple_case_expression", "case_operand", "simple_when_clause", "coalesce_expression", 
			"nullif_expression", "extension_functions", "extract_function", "enum_function", 
			"date_part", "input_parameter", "literal", "constructor_name", "enum_literal", 
			"boolean_literal", "field", "identification_variable", "parameter_name", 
			"escape_character", "trim_character", "string_literal", "numeric_literal", 
			"decimal_literal", "single_valued_object_field", "single_valued_embeddable_object_field", 
			"collection_valued_field", "entity_name", "subtype", "entity_type_literal", 
			"function_name", "state_field", "result_variable", "superquery_identification_variable", 
			"date_time_timestamp_literal", "pattern_value", "collection_valued_input_parameter", 
			"single_valued_input_parameter", "enum_value_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'UPDATE'", "'DELETE'", "'FROM'", "','", "'AS'", "'ON'", 
			"'FETCH'", "'LEFT'", "'OUTER'", "'INNER'", "'JOIN'", "'.'", "'TREAT('", 
			"'ENTRY('", "'KEY('", "'VALUE('", "'SET'", "'='", "'NULL'", "'DISTINCT'", 
			"'+'", "'-'", "'*'", "'/'", "'OBJECT'", "'NEW'", "'COUNT'", "'AVG'", 
			"'MAX'", "'MIN'", "'SUM'", "'WHERE'", "'GROUP'", "'BY'", "'HAVING'", 
			"'ORDER'", "'ASC'", "'DESC'", "'NULLS FIRST'", "'NULLS LAST'", "'OR'", 
			"'AND'", "'@BETWEEN'", "'NOW'", "'YEAR'", "'MONTH'", "'DAY'", "'HOUR'", 
			"'MINUTE'", "'SECOND'", "'USER_TIMEZONE'", "'@DATEBEFORE'", "'@DATEAFTER'", 
			"'@DATEEQUALS'", "'@TODAY'", "'BETWEEN'", "'LIKE'", "'ESCAPE'", "'IS'", 
			"'EMPTY'", "'MEMBER'", "'OF'", "'EXISTS'", "'ALL'", "'ANY'", "'SOME'", 
			"'REGEXP'", "'<>'", "'>'", "'>='", "'<'", "'<='", "'TYPE('", "'LENGTH('", 
			"'LOCATE('", "'ABS('", "'SQRT('", "'MOD('", "'SIZE('", "'INDEX('", "'CURRENT_DATE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CONCAT('", "'SUBSTRING('", 
			"'TRIM('", "'LOWER'", "'UPPER('", "'LEADING'", "'TRAILING'", "'BOTH'", 
			"'FUNCTION('", "'CASE'", "'ELSE'", "'END'", "'WHEN'", "'THEN'", "'COALESCE('", 
			"'NULLIF('", "'CAST('", "'EXTRACT('", "'@ENUM'", "'EPOCH'", "'QUARTER'", 
			"'WEEK'", "'?'", "'${'", "'}'", "'true'", "'false'", "'0x'", "'NOT'", 
			"'IN'", "''.''", null, null, null, null, null, null, null, null, null, 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NOT", "IN", "TRIM_CHARACTER", "STRING_LITERAL", 
			"WORD", "RUSSIAN_SYMBOLS", "NAMED_PARAMETER", "WS", "COMMENT", "LINE_COMMENT", 
			"ESCAPE_CHARACTER", "INT_NUMERAL", "LPAREN", "RPAREN", "T_SELECTED_ITEMS", 
			"T_SELECTED_ITEM", "T_SOURCES", "T_SOURCE", "T_SELECTED_FIELD", "T_SELECTED_ENTITY", 
			"T_ID_VAR", "T_JOIN_VAR", "T_COLLECTION_MEMBER", "T_QUERY", "T_CONDITION", 
			"T_SIMPLE_CONDITION", "T_PARAMETER", "T_GROUP_BY", "T_ORDER_BY", "T_ORDER_BY_FIELD", 
			"T_AGGREGATE_EXPR", "T_ENUM_MACROS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JPA2.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JPA2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Ql_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Ql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterQl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitQl_statement(this);
		}
	}

	public final Ql_statementContext ql_statement() throws RecognitionException {
		Ql_statementContext _localctx = new Ql_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ql_statement);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				select_statement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				update_statement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				delete_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public Token sl;
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JPA2Parser.EOF, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((Select_statementContext)_localctx).sl = match(T__0);
			setState(272);
			select_clause();
			setState(273);
			from_clause();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(274);
				where_clause();
				}
			}

			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(277);
				groupby_clause();
				}
			}

			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(280);
				having_clause();
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(283);
				orderby_clause();
				}
			}

			setState(286);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public Token up;
		public Update_clauseContext update_clause() {
			return getRuleContext(Update_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((Update_statementContext)_localctx).up = match(T__1);
			setState(289);
			update_clause();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(290);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public Token dl;
		public Delete_clauseContext delete_clause() {
			return getRuleContext(Delete_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDelete_statement(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((Delete_statementContext)_localctx).dl = match(T__2);
			setState(294);
			delete_clause();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(295);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public Token fr;
		public Identification_variable_declarationContext identification_variable_declaration() {
			return getRuleContext(Identification_variable_declarationContext.class,0);
		}
		public List<Identification_variable_declaration_or_collection_member_declarationContext> identification_variable_declaration_or_collection_member_declaration() {
			return getRuleContexts(Identification_variable_declaration_or_collection_member_declarationContext.class);
		}
		public Identification_variable_declaration_or_collection_member_declarationContext identification_variable_declaration_or_collection_member_declaration(int i) {
			return getRuleContext(Identification_variable_declaration_or_collection_member_declarationContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((From_clauseContext)_localctx).fr = match(T__3);
			setState(299);
			identification_variable_declaration();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(300);
				match(T__4);
				setState(301);
				identification_variable_declaration_or_collection_member_declaration();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identification_variable_declaration_or_collection_member_declarationContext extends ParserRuleContext {
		public Identification_variable_declarationContext identification_variable_declaration() {
			return getRuleContext(Identification_variable_declarationContext.class,0);
		}
		public Collection_member_declarationContext collection_member_declaration() {
			return getRuleContext(Collection_member_declarationContext.class,0);
		}
		public Identification_variable_declaration_or_collection_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_variable_declaration_or_collection_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterIdentification_variable_declaration_or_collection_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitIdentification_variable_declaration_or_collection_member_declaration(this);
		}
	}

	public final Identification_variable_declaration_or_collection_member_declarationContext identification_variable_declaration_or_collection_member_declaration() throws RecognitionException {
		Identification_variable_declaration_or_collection_member_declarationContext _localctx = new Identification_variable_declaration_or_collection_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identification_variable_declaration_or_collection_member_declaration);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				identification_variable_declaration();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				collection_member_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identification_variable_declarationContext extends ParserRuleContext {
		public Range_variable_declarationContext range_variable_declaration() {
			return getRuleContext(Range_variable_declarationContext.class,0);
		}
		public List<Joined_clauseContext> joined_clause() {
			return getRuleContexts(Joined_clauseContext.class);
		}
		public Joined_clauseContext joined_clause(int i) {
			return getRuleContext(Joined_clauseContext.class,i);
		}
		public Identification_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterIdentification_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitIdentification_variable_declaration(this);
		}
	}

	public final Identification_variable_declarationContext identification_variable_declaration() throws RecognitionException {
		Identification_variable_declarationContext _localctx = new Identification_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identification_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			range_variable_declaration();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(312);
				joined_clause();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_sectionContext extends ParserRuleContext {
		public List<Joined_clauseContext> joined_clause() {
			return getRuleContexts(Joined_clauseContext.class);
		}
		public Joined_clauseContext joined_clause(int i) {
			return getRuleContext(Joined_clauseContext.class,i);
		}
		public Join_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterJoin_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitJoin_section(this);
		}
	}

	public final Join_sectionContext join_section() throws RecognitionException {
		Join_sectionContext _localctx = new Join_sectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_join_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(318);
				joined_clause();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joined_clauseContext extends ParserRuleContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public Fetch_joinContext fetch_join() {
			return getRuleContext(Fetch_joinContext.class,0);
		}
		public Joined_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterJoined_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitJoined_clause(this);
		}
	}

	public final Joined_clauseContext joined_clause() throws RecognitionException {
		Joined_clauseContext _localctx = new Joined_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_joined_clause);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				join();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				fetch_join();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_variable_declarationContext extends ParserRuleContext {
		public Entity_nameContext entity_name() {
			return getRuleContext(Entity_nameContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Range_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterRange_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitRange_variable_declaration(this);
		}
	}

	public final Range_variable_declarationContext range_variable_declaration() throws RecognitionException {
		Range_variable_declarationContext _localctx = new Range_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_range_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			entity_name();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(329);
				match(T__5);
				}
			}

			setState(332);
			identification_variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public Join_specContext join_spec() {
			return getRuleContext(Join_specContext.class,0);
		}
		public Join_association_path_expressionContext join_association_path_expression() {
			return getRuleContext(Join_association_path_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			join_spec();
			setState(335);
			join_association_path_expression();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(336);
				match(T__5);
				}
			}

			setState(339);
			identification_variable();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(340);
				match(T__6);
				setState(341);
				conditional_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_joinContext extends ParserRuleContext {
		public Join_specContext join_spec() {
			return getRuleContext(Join_specContext.class,0);
		}
		public Join_association_path_expressionContext join_association_path_expression() {
			return getRuleContext(Join_association_path_expressionContext.class,0);
		}
		public Fetch_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFetch_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFetch_join(this);
		}
	}

	public final Fetch_joinContext fetch_join() throws RecognitionException {
		Fetch_joinContext _localctx = new Fetch_joinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fetch_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			join_spec();
			setState(345);
			match(T__7);
			setState(346);
			join_association_path_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_specContext extends ParserRuleContext {
		public Join_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterJoin_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitJoin_spec(this);
		}
	}

	public final Join_specContext join_spec() throws RecognitionException {
		Join_specContext _localctx = new Join_specContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				{
				setState(348);
				match(T__8);
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(349);
					match(T__9);
					}
				}

				}
				break;
			case T__10:
				{
				setState(352);
				match(T__10);
				}
				break;
			case T__11:
				break;
			default:
				break;
			}
			setState(355);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_association_path_expressionContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public SubtypeContext subtype() {
			return getRuleContext(SubtypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Entity_nameContext entity_name() {
			return getRuleContext(Entity_nameContext.class,0);
		}
		public Join_association_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_association_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterJoin_association_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitJoin_association_path_expression(this);
		}
	}

	public final Join_association_path_expressionContext join_association_path_expression() throws RecognitionException {
		Join_association_path_expressionContext _localctx = new Join_association_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_join_association_path_expression);
		try {
			int _alt;
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				identification_variable();
				setState(358);
				match(T__12);
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						field();
						setState(360);
						match(T__12);
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(367);
					field();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(T__13);
				setState(371);
				identification_variable();
				setState(372);
				match(T__12);
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						field();
						setState(374);
						match(T__12);
						}
						} 
					}
					setState(380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(381);
					field();
					}
					break;
				}
				setState(384);
				match(T__5);
				setState(385);
				subtype();
				setState(386);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				entity_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_member_declarationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(JPA2Parser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Collection_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCollection_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCollection_member_declaration(this);
		}
	}

	public final Collection_member_declarationContext collection_member_declaration() throws RecognitionException {
		Collection_member_declarationContext _localctx = new Collection_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_collection_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IN);
			setState(392);
			match(LPAREN);
			setState(393);
			path_expression();
			setState(394);
			match(RPAREN);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(395);
				match(T__5);
				}
			}

			setState(398);
			identification_variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_identification_variableContext extends ParserRuleContext {
		public Map_field_identification_variableContext map_field_identification_variable() {
			return getRuleContext(Map_field_identification_variableContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Qualified_identification_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identification_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterQualified_identification_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitQualified_identification_variable(this);
		}
	}

	public final Qualified_identification_variableContext qualified_identification_variable() throws RecognitionException {
		Qualified_identification_variableContext _localctx = new Qualified_identification_variableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qualified_identification_variable);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				map_field_identification_variable();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__14);
				setState(402);
				identification_variable();
				setState(403);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_field_identification_variableContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Map_field_identification_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_field_identification_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterMap_field_identification_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitMap_field_identification_variable(this);
		}
	}

	public final Map_field_identification_variableContext map_field_identification_variable() throws RecognitionException {
		Map_field_identification_variableContext _localctx = new Map_field_identification_variableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_map_field_identification_variable);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__15);
				setState(408);
				identification_variable();
				setState(409);
				match(RPAREN);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T__16);
				setState(412);
				identification_variable();
				setState(413);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_expressionContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public Path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterPath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitPath_expression(this);
		}
	}

	public final Path_expressionContext path_expression() throws RecognitionException {
		Path_expressionContext _localctx = new Path_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_path_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			identification_variable();
			setState(418);
			match(T__12);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					field();
					setState(420);
					match(T__12);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(427);
				field();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_identification_variableContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Map_field_identification_variableContext map_field_identification_variable() {
			return getRuleContext(Map_field_identification_variableContext.class,0);
		}
		public General_identification_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_identification_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterGeneral_identification_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitGeneral_identification_variable(this);
		}
	}

	public final General_identification_variableContext general_identification_variable() throws RecognitionException {
		General_identification_variableContext _localctx = new General_identification_variableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_general_identification_variable);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				identification_variable();
				}
				break;
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				map_field_identification_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_clauseContext extends ParserRuleContext {
		public Identification_variable_declarationContext identification_variable_declaration() {
			return getRuleContext(Identification_variable_declarationContext.class,0);
		}
		public List<Update_itemContext> update_item() {
			return getRuleContexts(Update_itemContext.class);
		}
		public Update_itemContext update_item(int i) {
			return getRuleContext(Update_itemContext.class,i);
		}
		public Update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterUpdate_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitUpdate_clause(this);
		}
	}

	public final Update_clauseContext update_clause() throws RecognitionException {
		Update_clauseContext _localctx = new Update_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_update_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			identification_variable_declaration();
			setState(435);
			match(T__17);
			setState(436);
			update_item();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(437);
				match(T__4);
				setState(438);
				update_item();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_itemContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public New_valueContext new_value() {
			return getRuleContext(New_valueContext.class,0);
		}
		public Update_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterUpdate_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitUpdate_item(this);
		}
	}

	public final Update_itemContext update_item() throws RecognitionException {
		Update_itemContext _localctx = new Update_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_update_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			path_expression();
			setState(445);
			match(T__18);
			setState(446);
			new_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_valueContext extends ParserRuleContext {
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Simple_entity_expressionContext simple_entity_expression() {
			return getRuleContext(Simple_entity_expressionContext.class,0);
		}
		public New_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterNew_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitNew_value(this);
		}
	}

	public final New_valueContext new_value() throws RecognitionException {
		New_valueContext _localctx = new New_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_new_value);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				scalar_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				simple_entity_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(T__19);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_clauseContext extends ParserRuleContext {
		public Token fr;
		public Identification_variable_declarationContext identification_variable_declaration() {
			return getRuleContext(Identification_variable_declarationContext.class,0);
		}
		public Delete_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDelete_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDelete_clause(this);
		}
	}

	public final Delete_clauseContext delete_clause() throws RecognitionException {
		Delete_clauseContext _localctx = new Delete_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_delete_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((Delete_clauseContext)_localctx).fr = match(T__3);
			setState(454);
			identification_variable_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_clauseContext extends ParserRuleContext {
		public List<Select_itemContext> select_item() {
			return getRuleContexts(Select_itemContext.class);
		}
		public Select_itemContext select_item(int i) {
			return getRuleContext(Select_itemContext.class,i);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSelect_clause(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(456);
				match(T__20);
				}
			}

			setState(459);
			select_item();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(460);
				match(T__4);
				setState(461);
				select_item();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_itemContext extends ParserRuleContext {
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Result_variableContext result_variable() {
			return getRuleContext(Result_variableContext.class,0);
		}
		public Select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSelect_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSelect_item(this);
		}
	}

	public final Select_itemContext select_item() throws RecognitionException {
		Select_itemContext _localctx = new Select_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			select_expression();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==WORD) {
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(468);
					match(T__5);
					}
				}

				setState(471);
				result_variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Constructor_expressionContext constructor_expression() {
			return getRuleContext(Constructor_expressionContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSelect_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSelect_expression(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_select_expression);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				path_expression();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
					{
					setState(475);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(476);
					scalar_expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				identification_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				scalar_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				aggregate_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(T__25);
				setState(483);
				match(LPAREN);
				setState(484);
				identification_variable();
				setState(485);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				constructor_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_expressionContext extends ParserRuleContext {
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public List<Constructor_itemContext> constructor_item() {
			return getRuleContexts(Constructor_itemContext.class);
		}
		public Constructor_itemContext constructor_item(int i) {
			return getRuleContext(Constructor_itemContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConstructor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConstructor_expression(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constructor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__26);
			setState(491);
			constructor_name();
			setState(492);
			match(LPAREN);
			setState(493);
			constructor_item();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(494);
				match(T__4);
				setState(495);
				constructor_item();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_itemContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Constructor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConstructor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConstructor_item(this);
		}
	}

	public final Constructor_itemContext constructor_item() throws RecognitionException {
		Constructor_itemContext _localctx = new Constructor_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructor_item);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				scalar_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				aggregate_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				identification_variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_expressionContext extends ParserRuleContext {
		public Aggregate_expression_function_nameContext aggregate_expression_function_name() {
			return getRuleContext(Aggregate_expression_function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Count_argumentContext count_argument() {
			return getRuleContext(Count_argumentContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public Aggregate_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterAggregate_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitAggregate_expression(this);
		}
	}

	public final Aggregate_expressionContext aggregate_expression() throws RecognitionException {
		Aggregate_expressionContext _localctx = new Aggregate_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aggregate_expression);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				aggregate_expression_function_name();
				setState(510);
				match(LPAREN);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(511);
					match(T__20);
					}
				}

				setState(514);
				arithmetic_expression();
				setState(515);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(T__27);
				setState(518);
				match(LPAREN);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(519);
					match(T__20);
					}
				}

				setState(522);
				count_argument();
				setState(523);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				function_invocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_expression_function_nameContext extends ParserRuleContext {
		public Aggregate_expression_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_expression_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterAggregate_expression_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitAggregate_expression_function_name(this);
		}
	}

	public final Aggregate_expression_function_nameContext aggregate_expression_function_name() throws RecognitionException {
		Aggregate_expression_function_nameContext _localctx = new Aggregate_expression_function_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_aggregate_expression_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Count_argumentContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Count_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCount_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCount_argument(this);
		}
	}

	public final Count_argumentContext count_argument() throws RecognitionException {
		Count_argumentContext _localctx = new Count_argumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_count_argument);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				identification_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				path_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public Token wh;
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			((Where_clauseContext)_localctx).wh = match(T__32);
			setState(535);
			conditional_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitGroupby_clause(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__33);
			setState(538);
			match(T__34);
			setState(539);
			groupby_item();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(540);
				match(T__4);
				setState(541);
				groupby_item();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Extract_functionContext extract_function() {
			return getRuleContext(Extract_functionContext.class,0);
		}
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitGroupby_item(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_groupby_item);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				identification_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				extract_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__35);
			setState(553);
			conditional_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitOrderby_clause(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__36);
			setState(556);
			match(T__34);
			setState(557);
			orderby_item();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(558);
				match(T__4);
				setState(559);
				orderby_item();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Orderby_variableContext orderby_variable() {
			return getRuleContext(Orderby_variableContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public SortNullsContext sortNulls() {
			return getRuleContext(SortNullsContext.class,0);
		}
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterOrderby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitOrderby_item(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			orderby_variable();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37 || _la==T__38) {
				{
				setState(566);
				sort();
				}
			}

			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__40) {
				{
				setState(569);
				sortNulls();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_variableContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public General_identification_variableContext general_identification_variable() {
			return getRuleContext(General_identification_variableContext.class,0);
		}
		public Result_variableContext result_variable() {
			return getRuleContext(Result_variableContext.class,0);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Orderby_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterOrderby_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitOrderby_variable(this);
		}
	}

	public final Orderby_variableContext orderby_variable() throws RecognitionException {
		Orderby_variableContext _localctx = new Orderby_variableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_orderby_variable);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				general_identification_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				result_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				scalar_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				aggregate_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortContext extends ParserRuleContext {
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSort(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortNullsContext extends ParserRuleContext {
		public SortNullsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortNulls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSortNulls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSortNulls(this);
		}
	}

	public final SortNullsContext sortNulls() throws RecognitionException {
		SortNullsContext _localctx = new SortNullsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sortNulls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Token lp;
		public Token rp;
		public Simple_select_clauseContext simple_select_clause() {
			return getRuleContext(Simple_select_clauseContext.class,0);
		}
		public Subquery_from_clauseContext subquery_from_clause() {
			return getRuleContext(Subquery_from_clauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			((SubqueryContext)_localctx).lp = match(LPAREN);
			setState(584);
			match(T__0);
			setState(585);
			simple_select_clause();
			setState(586);
			subquery_from_clause();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(587);
				where_clause();
				}
			}

			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(590);
				groupby_clause();
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(593);
				having_clause();
				}
			}

			setState(596);
			((SubqueryContext)_localctx).rp = match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_from_clauseContext extends ParserRuleContext {
		public Token fr;
		public List<Subselect_identification_variable_declarationContext> subselect_identification_variable_declaration() {
			return getRuleContexts(Subselect_identification_variable_declarationContext.class);
		}
		public Subselect_identification_variable_declarationContext subselect_identification_variable_declaration(int i) {
			return getRuleContext(Subselect_identification_variable_declarationContext.class,i);
		}
		public Subquery_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSubquery_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSubquery_from_clause(this);
		}
	}

	public final Subquery_from_clauseContext subquery_from_clause() throws RecognitionException {
		Subquery_from_clauseContext _localctx = new Subquery_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subquery_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			((Subquery_from_clauseContext)_localctx).fr = match(T__3);
			setState(599);
			subselect_identification_variable_declaration();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(600);
				match(T__4);
				setState(601);
				subselect_identification_variable_declaration();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_identification_variable_declarationContext extends ParserRuleContext {
		public Identification_variable_declarationContext identification_variable_declaration() {
			return getRuleContext(Identification_variable_declarationContext.class,0);
		}
		public Derived_path_expressionContext derived_path_expression() {
			return getRuleContext(Derived_path_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public Derived_collection_member_declarationContext derived_collection_member_declaration() {
			return getRuleContext(Derived_collection_member_declarationContext.class,0);
		}
		public Subselect_identification_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_identification_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSubselect_identification_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSubselect_identification_variable_declaration(this);
		}
	}

	public final Subselect_identification_variable_declarationContext subselect_identification_variable_declaration() throws RecognitionException {
		Subselect_identification_variable_declarationContext _localctx = new Subselect_identification_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_subselect_identification_variable_declaration);
		int _la;
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				identification_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				derived_path_expression();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(609);
					match(T__5);
					}
				}

				setState(612);
				identification_variable();
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) {
					{
					{
					setState(613);
					join();
					}
					}
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				derived_collection_member_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_path_expressionContext extends ParserRuleContext {
		public General_derived_pathContext general_derived_path() {
			return getRuleContext(General_derived_pathContext.class,0);
		}
		public Single_valued_object_fieldContext single_valued_object_field() {
			return getRuleContext(Single_valued_object_fieldContext.class,0);
		}
		public Collection_valued_fieldContext collection_valued_field() {
			return getRuleContext(Collection_valued_fieldContext.class,0);
		}
		public Derived_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDerived_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDerived_path_expression(this);
		}
	}

	public final Derived_path_expressionContext derived_path_expression() throws RecognitionException {
		Derived_path_expressionContext _localctx = new Derived_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_derived_path_expression);
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				general_derived_path();
				setState(623);
				match(T__12);
				setState(624);
				single_valued_object_field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				general_derived_path();
				setState(627);
				match(T__12);
				setState(628);
				collection_valued_field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_derived_pathContext extends ParserRuleContext {
		public Simple_derived_pathContext simple_derived_path() {
			return getRuleContext(Simple_derived_pathContext.class,0);
		}
		public Treated_derived_pathContext treated_derived_path() {
			return getRuleContext(Treated_derived_pathContext.class,0);
		}
		public List<Single_valued_object_fieldContext> single_valued_object_field() {
			return getRuleContexts(Single_valued_object_fieldContext.class);
		}
		public Single_valued_object_fieldContext single_valued_object_field(int i) {
			return getRuleContext(Single_valued_object_fieldContext.class,i);
		}
		public General_derived_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_derived_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterGeneral_derived_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitGeneral_derived_path(this);
		}
	}

	public final General_derived_pathContext general_derived_path() throws RecognitionException {
		General_derived_pathContext _localctx = new General_derived_pathContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_general_derived_path);
		try {
			int _alt;
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				simple_derived_path();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				treated_derived_path();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						match(T__12);
						setState(635);
						single_valued_object_field();
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_derived_pathContext extends ParserRuleContext {
		public Superquery_identification_variableContext superquery_identification_variable() {
			return getRuleContext(Superquery_identification_variableContext.class,0);
		}
		public Simple_derived_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_derived_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_derived_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_derived_path(this);
		}
	}

	public final Simple_derived_pathContext simple_derived_path() throws RecognitionException {
		Simple_derived_pathContext _localctx = new Simple_derived_pathContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simple_derived_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			superquery_identification_variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Treated_derived_pathContext extends ParserRuleContext {
		public General_derived_pathContext general_derived_path() {
			return getRuleContext(General_derived_pathContext.class,0);
		}
		public SubtypeContext subtype() {
			return getRuleContext(SubtypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Treated_derived_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treated_derived_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterTreated_derived_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitTreated_derived_path(this);
		}
	}

	public final Treated_derived_pathContext treated_derived_path() throws RecognitionException {
		Treated_derived_pathContext _localctx = new Treated_derived_pathContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_treated_derived_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__13);
			setState(646);
			general_derived_path();
			setState(647);
			match(T__5);
			setState(648);
			subtype();
			setState(649);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_collection_member_declarationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(JPA2Parser.IN, 0); }
		public Superquery_identification_variableContext superquery_identification_variable() {
			return getRuleContext(Superquery_identification_variableContext.class,0);
		}
		public Collection_valued_fieldContext collection_valued_field() {
			return getRuleContext(Collection_valued_fieldContext.class,0);
		}
		public List<Single_valued_object_fieldContext> single_valued_object_field() {
			return getRuleContexts(Single_valued_object_fieldContext.class);
		}
		public Single_valued_object_fieldContext single_valued_object_field(int i) {
			return getRuleContext(Single_valued_object_fieldContext.class,i);
		}
		public Derived_collection_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_collection_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDerived_collection_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDerived_collection_member_declaration(this);
		}
	}

	public final Derived_collection_member_declarationContext derived_collection_member_declaration() throws RecognitionException {
		Derived_collection_member_declarationContext _localctx = new Derived_collection_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_derived_collection_member_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(IN);
			setState(652);
			superquery_identification_variable();
			setState(653);
			match(T__12);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654);
					single_valued_object_field();
					setState(655);
					match(T__12);
					}
					} 
				}
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(662);
			collection_valued_field();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_clauseContext extends ParserRuleContext {
		public Simple_select_expressionContext simple_select_expression() {
			return getRuleContext(Simple_select_expressionContext.class,0);
		}
		public Simple_select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_select_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_select_clause(this);
		}
	}

	public final Simple_select_clauseContext simple_select_clause() throws RecognitionException {
		Simple_select_clauseContext _localctx = new Simple_select_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_simple_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(664);
				match(T__20);
				}
			}

			setState(667);
			simple_select_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Simple_select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_select_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_select_expression(this);
		}
	}

	public final Simple_select_expressionContext simple_select_expression() throws RecognitionException {
		Simple_select_expressionContext _localctx = new Simple_select_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simple_select_expression);
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				scalar_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				aggregate_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				identification_variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_expressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Enum_expressionContext enum_expression() {
			return getRuleContext(Enum_expressionContext.class,0);
		}
		public Datetime_expressionContext datetime_expression() {
			return getRuleContext(Datetime_expressionContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Entity_type_expressionContext entity_type_expression() {
			return getRuleContext(Entity_type_expressionContext.class,0);
		}
		public Scalar_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterScalar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitScalar_expression(this);
		}
	}

	public final Scalar_expressionContext scalar_expression() throws RecognitionException {
		Scalar_expressionContext _localctx = new Scalar_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_scalar_expression);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				arithmetic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				enum_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				datetime_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				boolean_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				case_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				entity_type_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<Conditional_termContext> conditional_term() {
			return getRuleContexts(Conditional_termContext.class);
		}
		public Conditional_termContext conditional_term(int i) {
			return getRuleContext(Conditional_termContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(684);
			conditional_term();
			}
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(685);
				match(T__41);
				setState(686);
				conditional_term();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_termContext extends ParserRuleContext {
		public List<Conditional_factorContext> conditional_factor() {
			return getRuleContexts(Conditional_factorContext.class);
		}
		public Conditional_factorContext conditional_factor(int i) {
			return getRuleContext(Conditional_factorContext.class,i);
		}
		public Conditional_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConditional_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConditional_term(this);
		}
	}

	public final Conditional_termContext conditional_term() throws RecognitionException {
		Conditional_termContext _localctx = new Conditional_termContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_conditional_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(692);
			conditional_factor();
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(693);
				match(T__42);
				setState(694);
				conditional_factor();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_factorContext extends ParserRuleContext {
		public Conditional_primaryContext conditional_primary() {
			return getRuleContext(Conditional_primaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public Conditional_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConditional_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConditional_factor(this);
		}
	}

	public final Conditional_factorContext conditional_factor() throws RecognitionException {
		Conditional_factorContext _localctx = new Conditional_factorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_conditional_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(700);
				match(NOT);
				}
				break;
			}
			setState(703);
			conditional_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_primaryContext extends ParserRuleContext {
		public Simple_cond_expressionContext simple_cond_expression() {
			return getRuleContext(Simple_cond_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Conditional_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConditional_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConditional_primary(this);
		}
	}

	public final Conditional_primaryContext conditional_primary() throws RecognitionException {
		Conditional_primaryContext _localctx = new Conditional_primaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_conditional_primary);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				simple_cond_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(LPAREN);
				setState(707);
				conditional_expression();
				setState(708);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_cond_expressionContext extends ParserRuleContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Between_expressionContext between_expression() {
			return getRuleContext(Between_expressionContext.class,0);
		}
		public In_expressionContext in_expression() {
			return getRuleContext(In_expressionContext.class,0);
		}
		public Like_expressionContext like_expression() {
			return getRuleContext(Like_expressionContext.class,0);
		}
		public Null_comparison_expressionContext null_comparison_expression() {
			return getRuleContext(Null_comparison_expressionContext.class,0);
		}
		public Empty_collection_comparison_expressionContext empty_collection_comparison_expression() {
			return getRuleContext(Empty_collection_comparison_expressionContext.class,0);
		}
		public Collection_member_expressionContext collection_member_expression() {
			return getRuleContext(Collection_member_expressionContext.class,0);
		}
		public Exists_expressionContext exists_expression() {
			return getRuleContext(Exists_expressionContext.class,0);
		}
		public Date_macro_expressionContext date_macro_expression() {
			return getRuleContext(Date_macro_expressionContext.class,0);
		}
		public Simple_cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_cond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_cond_expression(this);
		}
	}

	public final Simple_cond_expressionContext simple_cond_expression() throws RecognitionException {
		Simple_cond_expressionContext _localctx = new Simple_cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_simple_cond_expression);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				comparison_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				between_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				in_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				like_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				null_comparison_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
				empty_collection_comparison_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(718);
				collection_member_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(719);
				exists_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(720);
				date_macro_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_macro_expressionContext extends ParserRuleContext {
		public Date_between_macro_expressionContext date_between_macro_expression() {
			return getRuleContext(Date_between_macro_expressionContext.class,0);
		}
		public Date_before_macro_expressionContext date_before_macro_expression() {
			return getRuleContext(Date_before_macro_expressionContext.class,0);
		}
		public Date_after_macro_expressionContext date_after_macro_expression() {
			return getRuleContext(Date_after_macro_expressionContext.class,0);
		}
		public Date_equals_macro_expressionContext date_equals_macro_expression() {
			return getRuleContext(Date_equals_macro_expressionContext.class,0);
		}
		public Date_today_macro_expressionContext date_today_macro_expression() {
			return getRuleContext(Date_today_macro_expressionContext.class,0);
		}
		public Date_macro_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_macro_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_macro_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_macro_expression(this);
		}
	}

	public final Date_macro_expressionContext date_macro_expression() throws RecognitionException {
		Date_macro_expressionContext _localctx = new Date_macro_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_date_macro_expression);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				date_between_macro_expression();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				date_before_macro_expression();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				date_after_macro_expression();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				date_equals_macro_expression();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				date_today_macro_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_between_macro_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public List<Numeric_literalContext> numeric_literal() {
			return getRuleContexts(Numeric_literalContext.class);
		}
		public Numeric_literalContext numeric_literal(int i) {
			return getRuleContext(Numeric_literalContext.class,i);
		}
		public Date_between_macro_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_between_macro_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_between_macro_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_between_macro_expression(this);
		}
	}

	public final Date_between_macro_expressionContext date_between_macro_expression() throws RecognitionException {
		Date_between_macro_expressionContext _localctx = new Date_between_macro_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_date_between_macro_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T__43);
			setState(731);
			match(LPAREN);
			setState(732);
			path_expression();
			setState(733);
			match(T__4);
			setState(734);
			match(T__44);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(736);
				numeric_literal();
				}
			}

			setState(739);
			match(T__4);
			setState(740);
			match(T__44);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(741);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(742);
				numeric_literal();
				}
			}

			setState(745);
			match(T__4);
			setState(746);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(747);
				match(T__4);
				setState(748);
				match(T__51);
				}
			}

			setState(751);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_before_macro_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public List<Path_expressionContext> path_expression() {
			return getRuleContexts(Path_expressionContext.class);
		}
		public Path_expressionContext path_expression(int i) {
			return getRuleContext(Path_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Date_before_macro_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_before_macro_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_before_macro_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_before_macro_expression(this);
		}
	}

	public final Date_before_macro_expressionContext date_before_macro_expression() throws RecognitionException {
		Date_before_macro_expressionContext _localctx = new Date_before_macro_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_date_before_macro_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__52);
			setState(754);
			match(LPAREN);
			setState(755);
			path_expression();
			setState(756);
			match(T__4);
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				{
				setState(757);
				path_expression();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				{
				setState(758);
				input_parameter();
				}
				break;
			case T__44:
				{
				setState(759);
				match(T__44);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__22) {
					{
					setState(760);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(761);
					numeric_literal();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(766);
				match(T__4);
				setState(767);
				match(T__51);
				}
			}

			setState(770);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_after_macro_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public List<Path_expressionContext> path_expression() {
			return getRuleContexts(Path_expressionContext.class);
		}
		public Path_expressionContext path_expression(int i) {
			return getRuleContext(Path_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Date_after_macro_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_after_macro_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_after_macro_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_after_macro_expression(this);
		}
	}

	public final Date_after_macro_expressionContext date_after_macro_expression() throws RecognitionException {
		Date_after_macro_expressionContext _localctx = new Date_after_macro_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_date_after_macro_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T__53);
			setState(773);
			match(LPAREN);
			setState(774);
			path_expression();
			setState(775);
			match(T__4);
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				{
				setState(776);
				path_expression();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				{
				setState(777);
				input_parameter();
				}
				break;
			case T__44:
				{
				setState(778);
				match(T__44);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__22) {
					{
					setState(779);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(780);
					numeric_literal();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(785);
				match(T__4);
				setState(786);
				match(T__51);
				}
			}

			setState(789);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_equals_macro_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public List<Path_expressionContext> path_expression() {
			return getRuleContexts(Path_expressionContext.class);
		}
		public Path_expressionContext path_expression(int i) {
			return getRuleContext(Path_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Date_equals_macro_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_equals_macro_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_equals_macro_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_equals_macro_expression(this);
		}
	}

	public final Date_equals_macro_expressionContext date_equals_macro_expression() throws RecognitionException {
		Date_equals_macro_expressionContext _localctx = new Date_equals_macro_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_date_equals_macro_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T__54);
			setState(792);
			match(LPAREN);
			setState(793);
			path_expression();
			setState(794);
			match(T__4);
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				{
				setState(795);
				path_expression();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				{
				setState(796);
				input_parameter();
				}
				break;
			case T__44:
				{
				setState(797);
				match(T__44);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__22) {
					{
					setState(798);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(799);
					numeric_literal();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(804);
				match(T__4);
				setState(805);
				match(T__51);
				}
			}

			setState(808);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_today_macro_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Date_today_macro_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_today_macro_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_today_macro_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_today_macro_expression(this);
		}
	}

	public final Date_today_macro_expressionContext date_today_macro_expression() throws RecognitionException {
		Date_today_macro_expressionContext _localctx = new Date_today_macro_expressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_date_today_macro_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__55);
			setState(811);
			match(LPAREN);
			setState(812);
			path_expression();
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(813);
				match(T__4);
				setState(814);
				match(T__51);
				}
			}

			setState(817);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_expressionContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public List<Datetime_expressionContext> datetime_expression() {
			return getRuleContexts(Datetime_expressionContext.class);
		}
		public Datetime_expressionContext datetime_expression(int i) {
			return getRuleContext(Datetime_expressionContext.class,i);
		}
		public Between_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterBetween_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitBetween_expression(this);
		}
	}

	public final Between_expressionContext between_expression() throws RecognitionException {
		Between_expressionContext _localctx = new Between_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_between_expression);
		int _la;
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				arithmetic_expression();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(820);
					match(NOT);
					}
				}

				setState(823);
				match(T__56);
				setState(824);
				arithmetic_expression();
				setState(825);
				match(T__42);
				setState(826);
				arithmetic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				string_expression();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(829);
					match(NOT);
					}
				}

				setState(832);
				match(T__56);
				setState(833);
				string_expression();
				setState(834);
				match(T__42);
				setState(835);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				datetime_expression();
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(838);
					match(NOT);
					}
				}

				setState(841);
				match(T__56);
				setState(842);
				datetime_expression();
				setState(843);
				match(T__42);
				setState(844);
				datetime_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_expressionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(JPA2Parser.IN, 0); }
		public List<Path_expressionContext> path_expression() {
			return getRuleContexts(Path_expressionContext.class);
		}
		public Path_expressionContext path_expression(int i) {
			return getRuleContext(Path_expressionContext.class,i);
		}
		public Type_discriminatorContext type_discriminator() {
			return getRuleContext(Type_discriminatorContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public List<In_itemContext> in_item() {
			return getRuleContexts(In_itemContext.class);
		}
		public In_itemContext in_item(int i) {
			return getRuleContext(In_itemContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Collection_valued_input_parameterContext collection_valued_input_parameter() {
			return getRuleContext(Collection_valued_input_parameterContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public In_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterIn_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitIn_expression(this);
		}
	}

	public final In_expressionContext in_expression() throws RecognitionException {
		In_expressionContext _localctx = new In_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_in_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(848);
				path_expression();
				}
				break;
			case 2:
				{
				setState(849);
				type_discriminator();
				}
				break;
			case 3:
				{
				setState(850);
				identification_variable();
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(853);
				match(NOT);
				}
			}

			setState(856);
			match(IN);
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(857);
				match(LPAREN);
				setState(858);
				in_item();
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(859);
					match(T__4);
					setState(860);
					in_item();
					}
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(866);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(868);
				subquery();
				}
				break;
			case 3:
				{
				setState(869);
				collection_valued_input_parameter();
				}
				break;
			case 4:
				{
				setState(870);
				match(LPAREN);
				setState(871);
				path_expression();
				setState(872);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_itemContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Single_valued_input_parameterContext single_valued_input_parameter() {
			return getRuleContext(Single_valued_input_parameterContext.class,0);
		}
		public Enum_functionContext enum_function() {
			return getRuleContext(Enum_functionContext.class,0);
		}
		public In_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterIn_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitIn_item(this);
		}
	}

	public final In_itemContext in_item() throws RecognitionException {
		In_itemContext _localctx = new In_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_in_item);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				string_literal();
				}
				break;
			case T__111:
			case INT_NUMERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				numeric_literal();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				single_valued_input_parameter();
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				enum_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Like_expressionContext extends ParserRuleContext {
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Pattern_valueContext pattern_value() {
			return getRuleContext(Pattern_valueContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public Escape_characterContext escape_character() {
			return getRuleContext(Escape_characterContext.class,0);
		}
		public Like_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterLike_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitLike_expression(this);
		}
	}

	public final Like_expressionContext like_expression() throws RecognitionException {
		Like_expressionContext _localctx = new Like_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_like_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			string_expression();
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(883);
				match(NOT);
				}
			}

			setState(886);
			match(T__57);
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(887);
				string_expression();
				}
				break;
			case 2:
				{
				setState(888);
				pattern_value();
				}
				break;
			case 3:
				{
				setState(889);
				input_parameter();
				}
				break;
			}
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__58) {
				{
				setState(892);
				match(T__58);
				setState(893);
				escape_character();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_comparison_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Join_association_path_expressionContext join_association_path_expression() {
			return getRuleContext(Join_association_path_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public Null_comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterNull_comparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitNull_comparison_expression(this);
		}
	}

	public final Null_comparison_expressionContext null_comparison_expression() throws RecognitionException {
		Null_comparison_expressionContext _localctx = new Null_comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_null_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(896);
				path_expression();
				}
				break;
			case 2:
				{
				setState(897);
				input_parameter();
				}
				break;
			case 3:
				{
				setState(898);
				join_association_path_expression();
				}
				break;
			}
			setState(901);
			match(T__59);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(902);
				match(NOT);
				}
			}

			setState(905);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_collection_comparison_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public Empty_collection_comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_collection_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEmpty_collection_comparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEmpty_collection_comparison_expression(this);
		}
	}

	public final Empty_collection_comparison_expressionContext empty_collection_comparison_expression() throws RecognitionException {
		Empty_collection_comparison_expressionContext _localctx = new Empty_collection_comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_empty_collection_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			path_expression();
			setState(908);
			match(T__59);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(909);
				match(NOT);
				}
			}

			setState(912);
			match(T__60);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_member_expressionContext extends ParserRuleContext {
		public Entity_or_value_expressionContext entity_or_value_expression() {
			return getRuleContext(Entity_or_value_expressionContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public Collection_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCollection_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCollection_member_expression(this);
		}
	}

	public final Collection_member_expressionContext collection_member_expression() throws RecognitionException {
		Collection_member_expressionContext _localctx = new Collection_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_collection_member_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			entity_or_value_expression();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(915);
				match(NOT);
				}
			}

			setState(918);
			match(T__61);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(919);
				match(T__62);
				}
			}

			setState(922);
			path_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_or_value_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Simple_entity_or_value_expressionContext simple_entity_or_value_expression() {
			return getRuleContext(Simple_entity_or_value_expressionContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Entity_or_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_or_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEntity_or_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEntity_or_value_expression(this);
		}
	}

	public final Entity_or_value_expressionContext entity_or_value_expression() throws RecognitionException {
		Entity_or_value_expressionContext _localctx = new Entity_or_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_entity_or_value_expression);
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				simple_entity_or_value_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_entity_or_value_expressionContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Simple_entity_or_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_entity_or_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_entity_or_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_entity_or_value_expression(this);
		}
	}

	public final Simple_entity_or_value_expressionContext simple_entity_or_value_expression() throws RecognitionException {
		Simple_entity_or_value_expressionContext _localctx = new Simple_entity_or_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_simple_entity_or_value_expression);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				identification_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				input_parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(931);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exists_expressionContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JPA2Parser.NOT, 0); }
		public Exists_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterExists_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitExists_expression(this);
		}
	}

	public final Exists_expressionContext exists_expression() throws RecognitionException {
		Exists_expressionContext _localctx = new Exists_expressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_exists_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(934);
				match(NOT);
				}
			}

			setState(937);
			match(T__63);
			setState(938);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_or_any_expressionContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public All_or_any_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_or_any_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterAll_or_any_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitAll_or_any_expression(this);
		}
	}

	public final All_or_any_expressionContext all_or_any_expression() throws RecognitionException {
		All_or_any_expressionContext _localctx = new All_or_any_expressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_all_or_any_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(941);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_expressionContext extends ParserRuleContext {
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public All_or_any_expressionContext all_or_any_expression() {
			return getRuleContext(All_or_any_expressionContext.class,0);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<Enum_expressionContext> enum_expression() {
			return getRuleContexts(Enum_expressionContext.class);
		}
		public Enum_expressionContext enum_expression(int i) {
			return getRuleContext(Enum_expressionContext.class,i);
		}
		public List<Datetime_expressionContext> datetime_expression() {
			return getRuleContexts(Datetime_expressionContext.class);
		}
		public Datetime_expressionContext datetime_expression(int i) {
			return getRuleContext(Datetime_expressionContext.class,i);
		}
		public List<Entity_expressionContext> entity_expression() {
			return getRuleContexts(Entity_expressionContext.class);
		}
		public Entity_expressionContext entity_expression(int i) {
			return getRuleContext(Entity_expressionContext.class,i);
		}
		public List<Entity_type_expressionContext> entity_type_expression() {
			return getRuleContexts(Entity_type_expressionContext.class);
		}
		public Entity_type_expressionContext entity_type_expression(int i) {
			return getRuleContext(Entity_type_expressionContext.class,i);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitComparison_expression(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_comparison_expression);
		int _la;
		try {
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				string_expression();
				setState(946);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
					{
					setState(944);
					comparison_operator();
					}
					break;
				case T__67:
					{
					setState(945);
					match(T__67);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(950);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__92:
				case T__93:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__106:
				case T__107:
				case STRING_LITERAL:
				case WORD:
				case NAMED_PARAMETER:
				case LPAREN:
					{
					setState(948);
					string_expression();
					}
					break;
				case T__64:
				case T__65:
				case T__66:
					{
					setState(949);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				boolean_expression();
				setState(953);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(956);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
				case T__92:
				case T__93:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__106:
				case T__107:
				case T__109:
				case T__110:
				case WORD:
				case NAMED_PARAMETER:
				case LPAREN:
					{
					setState(954);
					boolean_expression();
					}
					break;
				case T__64:
				case T__65:
				case T__66:
					{
					setState(955);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				enum_expression();
				setState(959);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(962);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
				case T__93:
				case T__98:
				case T__99:
				case T__106:
				case T__107:
				case WORD:
				case NAMED_PARAMETER:
				case LPAREN:
					{
					setState(960);
					enum_expression();
					}
					break;
				case T__64:
				case T__65:
				case T__66:
					{
					setState(961);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				datetime_expression();
				setState(965);
				comparison_operator();
				setState(968);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__81:
				case T__82:
				case T__83:
				case T__92:
				case T__93:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__106:
				case T__107:
				case WORD:
				case NAMED_PARAMETER:
				case LPAREN:
					{
					setState(966);
					datetime_expression();
					}
					break;
				case T__64:
				case T__65:
				case T__66:
					{
					setState(967);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
				entity_expression();
				setState(971);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
				case T__106:
				case T__107:
				case WORD:
				case NAMED_PARAMETER:
					{
					setState(972);
					entity_expression();
					}
					break;
				case T__64:
				case T__65:
				case T__66:
					{
					setState(973);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(976);
				entity_type_expression();
				setState(977);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(978);
				entity_type_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(980);
				arithmetic_expression();
				setState(981);
				comparison_operator();
				setState(984);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
				case T__22:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__92:
				case T__93:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__106:
				case T__107:
				case T__111:
				case WORD:
				case NAMED_PARAMETER:
				case INT_NUMERAL:
				case LPAREN:
					{
					setState(982);
					arithmetic_expression();
					}
					break;
				case T__64:
				case T__65:
				case T__66:
					{
					setState(983);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__68 - 19)) | (1L << (T__69 - 19)) | (1L << (T__70 - 19)) | (1L << (T__71 - 19)) | (1L << (T__72 - 19)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public List<Arithmetic_termContext> arithmetic_term() {
			return getRuleContexts(Arithmetic_termContext.class);
		}
		public Arithmetic_termContext arithmetic_term(int i) {
			return getRuleContext(Arithmetic_termContext.class,i);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitArithmetic_expression(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arithmetic_expression);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				arithmetic_term();
				setState(993); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(991);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(992);
					arithmetic_term();
					}
					}
					setState(995); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__21 || _la==T__22 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				arithmetic_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_termContext extends ParserRuleContext {
		public List<Arithmetic_factorContext> arithmetic_factor() {
			return getRuleContexts(Arithmetic_factorContext.class);
		}
		public Arithmetic_factorContext arithmetic_factor(int i) {
			return getRuleContext(Arithmetic_factorContext.class,i);
		}
		public Arithmetic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterArithmetic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitArithmetic_term(this);
		}
	}

	public final Arithmetic_termContext arithmetic_term() throws RecognitionException {
		Arithmetic_termContext _localctx = new Arithmetic_termContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arithmetic_term);
		int _la;
		try {
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				arithmetic_factor();
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1001);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==T__24) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1002);
					arithmetic_factor();
					}
					}
					setState(1005); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__23 || _la==T__24 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				arithmetic_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_factorContext extends ParserRuleContext {
		public Arithmetic_primaryContext arithmetic_primary() {
			return getRuleContext(Arithmetic_primaryContext.class,0);
		}
		public Arithmetic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterArithmetic_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitArithmetic_factor(this);
		}
	}

	public final Arithmetic_factorContext arithmetic_factor() throws RecognitionException {
		Arithmetic_factorContext _localctx = new Arithmetic_factorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arithmetic_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(1010);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1013);
			arithmetic_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_primaryContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Functions_returning_numericsContext functions_returning_numerics() {
			return getRuleContext(Functions_returning_numericsContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public Extension_functionsContext extension_functions() {
			return getRuleContext(Extension_functionsContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Arithmetic_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterArithmetic_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitArithmetic_primary(this);
		}
	}

	public final Arithmetic_primaryContext arithmetic_primary() throws RecognitionException {
		Arithmetic_primaryContext _localctx = new Arithmetic_primaryContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arithmetic_primary);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				decimal_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1017);
				numeric_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1018);
				match(LPAREN);
				setState(1019);
				arithmetic_expression();
				setState(1020);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1022);
				input_parameter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1023);
				functions_returning_numerics();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1024);
				aggregate_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1025);
				case_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1026);
				function_invocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1027);
				extension_functions();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1028);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Functions_returning_stringsContext functions_returning_strings() {
			return getRuleContext(Functions_returning_stringsContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public Extension_functionsContext extension_functions() {
			return getRuleContext(Extension_functionsContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_string_expression);
		try {
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
				input_parameter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1034);
				functions_returning_strings();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1035);
				aggregate_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1036);
				case_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1037);
				function_invocation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1038);
				extension_functions();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1039);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datetime_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Functions_returning_datetimeContext functions_returning_datetime() {
			return getRuleContext(Functions_returning_datetimeContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public Extension_functionsContext extension_functions() {
			return getRuleContext(Extension_functionsContext.class,0);
		}
		public Date_time_timestamp_literalContext date_time_timestamp_literal() {
			return getRuleContext(Date_time_timestamp_literalContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Datetime_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDatetime_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDatetime_expression(this);
		}
	}

	public final Datetime_expressionContext datetime_expression() throws RecognitionException {
		Datetime_expressionContext _localctx = new Datetime_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_datetime_expression);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				input_parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				functions_returning_datetime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1045);
				aggregate_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1046);
				case_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1047);
				function_invocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1048);
				extension_functions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1049);
				date_time_timestamp_literal();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1050);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public Extension_functionsContext extension_functions() {
			return getRuleContext(Extension_functionsContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitBoolean_expression(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_boolean_expression);
		try {
			setState(1060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				path_expression();
				}
				break;
			case T__109:
			case T__110:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				boolean_literal();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				input_parameter();
				}
				break;
			case T__93:
			case T__98:
			case T__99:
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				case_expression();
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 5);
				{
				setState(1057);
				function_invocation();
				}
				break;
			case T__100:
			case T__101:
			case T__102:
				enterOuterAlt(_localctx, 6);
				{
				setState(1058);
				extension_functions();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1059);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Enum_literalContext enum_literal() {
			return getRuleContext(Enum_literalContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Enum_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEnum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEnum_expression(this);
		}
	}

	public final Enum_expressionContext enum_expression() throws RecognitionException {
		Enum_expressionContext _localctx = new Enum_expressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enum_expression);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				enum_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				input_parameter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				case_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1066);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_expressionContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Simple_entity_expressionContext simple_entity_expression() {
			return getRuleContext(Simple_entity_expressionContext.class,0);
		}
		public Entity_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEntity_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEntity_expression(this);
		}
	}

	public final Entity_expressionContext entity_expression() throws RecognitionException {
		Entity_expressionContext _localctx = new Entity_expressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_entity_expression);
		try {
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				simple_entity_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_entity_expressionContext extends ParserRuleContext {
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Simple_entity_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_entity_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_entity_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_entity_expression(this);
		}
	}

	public final Simple_entity_expressionContext simple_entity_expression() throws RecognitionException {
		Simple_entity_expressionContext _localctx = new Simple_entity_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_simple_entity_expression);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				identification_variable();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				input_parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_type_expressionContext extends ParserRuleContext {
		public Type_discriminatorContext type_discriminator() {
			return getRuleContext(Type_discriminatorContext.class,0);
		}
		public Entity_type_literalContext entity_type_literal() {
			return getRuleContext(Entity_type_literalContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Entity_type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_type_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEntity_type_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEntity_type_expression(this);
		}
	}

	public final Entity_type_expressionContext entity_type_expression() throws RecognitionException {
		Entity_type_expressionContext _localctx = new Entity_type_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_entity_type_expression);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__73:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				type_discriminator();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				entity_type_literal();
				}
				break;
			case T__106:
			case T__107:
			case NAMED_PARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				input_parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_discriminatorContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public General_identification_variableContext general_identification_variable() {
			return getRuleContext(General_identification_variableContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Type_discriminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_discriminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterType_discriminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitType_discriminator(this);
		}
	}

	public final Type_discriminatorContext type_discriminator() throws RecognitionException {
		Type_discriminatorContext _localctx = new Type_discriminatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_type_discriminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(T__73);
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1083);
				general_identification_variable();
				}
				break;
			case 2:
				{
				setState(1084);
				path_expression();
				}
				break;
			case 3:
				{
				setState(1085);
				input_parameter();
				}
				break;
			}
			setState(1088);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functions_returning_numericsContext extends ParserRuleContext {
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Identification_variableContext identification_variable() {
			return getRuleContext(Identification_variableContext.class,0);
		}
		public Functions_returning_numericsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_returning_numerics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFunctions_returning_numerics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFunctions_returning_numerics(this);
		}
	}

	public final Functions_returning_numericsContext functions_returning_numerics() throws RecognitionException {
		Functions_returning_numericsContext _localctx = new Functions_returning_numericsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_functions_returning_numerics);
		int _la;
		try {
			setState(1126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__74:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				match(T__74);
				setState(1091);
				string_expression();
				setState(1092);
				match(RPAREN);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(T__75);
				setState(1095);
				string_expression();
				setState(1096);
				match(T__4);
				setState(1097);
				string_expression();
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(1098);
					match(T__4);
					setState(1099);
					arithmetic_expression();
					}
				}

				setState(1102);
				match(RPAREN);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				match(T__76);
				setState(1105);
				arithmetic_expression();
				setState(1106);
				match(RPAREN);
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 4);
				{
				setState(1108);
				match(T__77);
				setState(1109);
				arithmetic_expression();
				setState(1110);
				match(RPAREN);
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 5);
				{
				setState(1112);
				match(T__78);
				setState(1113);
				arithmetic_expression();
				setState(1114);
				match(T__4);
				setState(1115);
				arithmetic_expression();
				setState(1116);
				match(RPAREN);
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 6);
				{
				setState(1118);
				match(T__79);
				setState(1119);
				path_expression();
				setState(1120);
				match(RPAREN);
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 7);
				{
				setState(1122);
				match(T__80);
				setState(1123);
				identification_variable();
				setState(1124);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functions_returning_datetimeContext extends ParserRuleContext {
		public Functions_returning_datetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_returning_datetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFunctions_returning_datetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFunctions_returning_datetime(this);
		}
	}

	public final Functions_returning_datetimeContext functions_returning_datetime() throws RecognitionException {
		Functions_returning_datetimeContext _localctx = new Functions_returning_datetimeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functions_returning_datetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__83 - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functions_returning_stringsContext extends ParserRuleContext {
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Trim_specificationContext trim_specification() {
			return getRuleContext(Trim_specificationContext.class,0);
		}
		public Trim_characterContext trim_character() {
			return getRuleContext(Trim_characterContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Functions_returning_stringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_returning_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFunctions_returning_strings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFunctions_returning_strings(this);
		}
	}

	public final Functions_returning_stringsContext functions_returning_strings() throws RecognitionException {
		Functions_returning_stringsContext _localctx = new Functions_returning_stringsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functions_returning_strings);
		int _la;
		try {
			setState(1175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				match(T__84);
				setState(1131);
				string_expression();
				setState(1132);
				match(T__4);
				setState(1133);
				string_expression();
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1134);
					match(T__4);
					setState(1135);
					string_expression();
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
				match(RPAREN);
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143);
				match(T__85);
				setState(1144);
				string_expression();
				setState(1145);
				match(T__4);
				setState(1146);
				arithmetic_expression();
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(1147);
					match(T__4);
					setState(1148);
					arithmetic_expression();
					}
				}

				setState(1151);
				match(RPAREN);
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 3);
				{
				setState(1153);
				match(T__86);
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__90 - 90)) | (1L << (T__91 - 90)) | (1L << (TRIM_CHARACTER - 90)))) != 0)) {
					{
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__90 - 90)) | (1L << (T__91 - 90)))) != 0)) {
						{
						setState(1154);
						trim_specification();
						}
					}

					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRIM_CHARACTER) {
						{
						setState(1157);
						trim_character();
						}
					}

					setState(1160);
					match(T__3);
					}
				}

				setState(1163);
				string_expression();
				setState(1164);
				match(RPAREN);
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 4);
				{
				setState(1166);
				match(T__87);
				setState(1167);
				match(LPAREN);
				setState(1168);
				string_expression();
				setState(1169);
				match(RPAREN);
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 5);
				{
				setState(1171);
				match(T__88);
				setState(1172);
				string_expression();
				setState(1173);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_specificationContext extends ParserRuleContext {
		public Trim_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterTrim_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitTrim_specification(this);
		}
	}

	public final Trim_specificationContext trim_specification() throws RecognitionException {
		Trim_specificationContext _localctx = new Trim_specificationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__90 - 90)) | (1L << (T__91 - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_invocationContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public List<Function_argContext> function_arg() {
			return getRuleContexts(Function_argContext.class);
		}
		public Function_argContext function_arg(int i) {
			return getRuleContext(Function_argContext.class,i);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFunction_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFunction_invocation(this);
		}
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(T__92);
			setState(1180);
			function_name();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1181);
				match(T__4);
				setState(1182);
				function_arg();
				}
				}
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1188);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Function_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFunction_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFunction_arg(this);
		}
	}

	public final Function_argContext function_arg() throws RecognitionException {
		Function_argContext _localctx = new Function_argContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_function_arg);
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				path_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				input_parameter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1193);
				scalar_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_expressionContext extends ParserRuleContext {
		public General_case_expressionContext general_case_expression() {
			return getRuleContext(General_case_expressionContext.class,0);
		}
		public Simple_case_expressionContext simple_case_expression() {
			return getRuleContext(Simple_case_expressionContext.class,0);
		}
		public Coalesce_expressionContext coalesce_expression() {
			return getRuleContext(Coalesce_expressionContext.class,0);
		}
		public Nullif_expressionContext nullif_expression() {
			return getRuleContext(Nullif_expressionContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCase_expression(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_case_expression);
		try {
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				general_case_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				simple_case_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1198);
				coalesce_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1199);
				nullif_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_case_expressionContext extends ParserRuleContext {
		public List<When_clauseContext> when_clause() {
			return getRuleContexts(When_clauseContext.class);
		}
		public When_clauseContext when_clause(int i) {
			return getRuleContext(When_clauseContext.class,i);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public General_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterGeneral_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitGeneral_case_expression(this);
		}
	}

	public final General_case_expressionContext general_case_expression() throws RecognitionException {
		General_case_expressionContext _localctx = new General_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_general_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(T__93);
			setState(1203);
			when_clause();
			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__96) {
				{
				{
				setState(1204);
				when_clause();
				}
				}
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1210);
			match(T__94);
			setState(1211);
			scalar_expression();
			setState(1212);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_clauseContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterWhen_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitWhen_clause(this);
		}
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(T__96);
			setState(1215);
			conditional_expression();
			setState(1216);
			match(T__97);
			setState(1217);
			scalar_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_case_expressionContext extends ParserRuleContext {
		public Case_operandContext case_operand() {
			return getRuleContext(Case_operandContext.class,0);
		}
		public List<Simple_when_clauseContext> simple_when_clause() {
			return getRuleContexts(Simple_when_clauseContext.class);
		}
		public Simple_when_clauseContext simple_when_clause(int i) {
			return getRuleContext(Simple_when_clauseContext.class,i);
		}
		public Scalar_expressionContext scalar_expression() {
			return getRuleContext(Scalar_expressionContext.class,0);
		}
		public Simple_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_case_expression(this);
		}
	}

	public final Simple_case_expressionContext simple_case_expression() throws RecognitionException {
		Simple_case_expressionContext _localctx = new Simple_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_simple_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(T__93);
			setState(1220);
			case_operand();
			setState(1221);
			simple_when_clause();
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__96) {
				{
				{
				setState(1222);
				simple_when_clause();
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1228);
			match(T__94);
			setState(1229);
			scalar_expression();
			setState(1230);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_operandContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Type_discriminatorContext type_discriminator() {
			return getRuleContext(Type_discriminatorContext.class,0);
		}
		public Case_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCase_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCase_operand(this);
		}
	}

	public final Case_operandContext case_operand() throws RecognitionException {
		Case_operandContext _localctx = new Case_operandContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_case_operand);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				path_expression();
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				type_discriminator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_when_clauseContext extends ParserRuleContext {
		public List<Scalar_expressionContext> scalar_expression() {
			return getRuleContexts(Scalar_expressionContext.class);
		}
		public Scalar_expressionContext scalar_expression(int i) {
			return getRuleContext(Scalar_expressionContext.class,i);
		}
		public Simple_when_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSimple_when_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSimple_when_clause(this);
		}
	}

	public final Simple_when_clauseContext simple_when_clause() throws RecognitionException {
		Simple_when_clauseContext _localctx = new Simple_when_clauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_simple_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(T__96);
			setState(1237);
			scalar_expression();
			setState(1238);
			match(T__97);
			setState(1239);
			scalar_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Coalesce_expressionContext extends ParserRuleContext {
		public List<Scalar_expressionContext> scalar_expression() {
			return getRuleContexts(Scalar_expressionContext.class);
		}
		public Scalar_expressionContext scalar_expression(int i) {
			return getRuleContext(Scalar_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Coalesce_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coalesce_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCoalesce_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCoalesce_expression(this);
		}
	}

	public final Coalesce_expressionContext coalesce_expression() throws RecognitionException {
		Coalesce_expressionContext _localctx = new Coalesce_expressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_coalesce_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(T__98);
			setState(1242);
			scalar_expression();
			setState(1245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1243);
				match(T__4);
				setState(1244);
				scalar_expression();
				}
				}
				setState(1247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(1249);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nullif_expressionContext extends ParserRuleContext {
		public List<Scalar_expressionContext> scalar_expression() {
			return getRuleContexts(Scalar_expressionContext.class);
		}
		public Scalar_expressionContext scalar_expression(int i) {
			return getRuleContext(Scalar_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Nullif_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullif_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterNullif_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitNullif_expression(this);
		}
	}

	public final Nullif_expressionContext nullif_expression() throws RecognitionException {
		Nullif_expressionContext _localctx = new Nullif_expressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_nullif_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(T__99);
			setState(1252);
			scalar_expression();
			setState(1253);
			match(T__4);
			setState(1254);
			scalar_expression();
			setState(1255);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_functionsContext extends ParserRuleContext {
		public Function_argContext function_arg() {
			return getRuleContext(Function_argContext.class,0);
		}
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(JPA2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(JPA2Parser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(JPA2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(JPA2Parser.LPAREN, i);
		}
		public List<TerminalNode> INT_NUMERAL() { return getTokens(JPA2Parser.INT_NUMERAL); }
		public TerminalNode INT_NUMERAL(int i) {
			return getToken(JPA2Parser.INT_NUMERAL, i);
		}
		public Extract_functionContext extract_function() {
			return getRuleContext(Extract_functionContext.class,0);
		}
		public Enum_functionContext enum_function() {
			return getRuleContext(Enum_functionContext.class,0);
		}
		public Extension_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterExtension_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitExtension_functions(this);
		}
	}

	public final Extension_functionsContext extension_functions() throws RecognitionException {
		Extension_functionsContext _localctx = new Extension_functionsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_extension_functions);
		int _la;
		try {
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__100:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(T__100);
				setState(1258);
				function_arg();
				setState(1259);
				match(WORD);
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(1260);
					match(LPAREN);
					setState(1261);
					match(INT_NUMERAL);
					setState(1266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1262);
						match(T__4);
						setState(1263);
						match(INT_NUMERAL);
						}
						}
						setState(1268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1269);
					match(RPAREN);
					}
					}
					setState(1274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1275);
				match(RPAREN);
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				extract_function();
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 3);
				{
				setState(1278);
				enum_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_functionContext extends ParserRuleContext {
		public Date_partContext date_part() {
			return getRuleContext(Date_partContext.class,0);
		}
		public Function_argContext function_arg() {
			return getRuleContext(Function_argContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Extract_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterExtract_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitExtract_function(this);
		}
	}

	public final Extract_functionContext extract_function() throws RecognitionException {
		Extract_functionContext _localctx = new Extract_functionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extract_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(T__101);
			setState(1282);
			date_part();
			setState(1283);
			match(T__3);
			setState(1284);
			function_arg();
			setState(1285);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_functionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JPA2Parser.LPAREN, 0); }
		public Enum_value_literalContext enum_value_literal() {
			return getRuleContext(Enum_value_literalContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JPA2Parser.RPAREN, 0); }
		public Enum_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEnum_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEnum_function(this);
		}
	}

	public final Enum_functionContext enum_function() throws RecognitionException {
		Enum_functionContext _localctx = new Enum_functionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enum_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(T__102);
			setState(1288);
			match(LPAREN);
			setState(1289);
			enum_value_literal();
			setState(1290);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_partContext extends ParserRuleContext {
		public Date_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_part(this);
		}
	}

	public final Date_partContext date_part() throws RecognitionException {
		Date_partContext _localctx = new Date_partContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_date_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_la = _input.LA(1);
			if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (T__45 - 46)) | (1L << (T__46 - 46)) | (1L << (T__47 - 46)) | (1L << (T__48 - 46)) | (1L << (T__49 - 46)) | (1L << (T__50 - 46)) | (1L << (T__103 - 46)) | (1L << (T__104 - 46)) | (1L << (T__105 - 46)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_parameterContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode NAMED_PARAMETER() { return getToken(JPA2Parser.NAMED_PARAMETER, 0); }
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Input_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterInput_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitInput_parameter(this);
		}
	}

	public final Input_parameterContext input_parameter() throws RecognitionException {
		Input_parameterContext _localctx = new Input_parameterContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_input_parameter);
		try {
			setState(1300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__106:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(T__106);
				setState(1295);
				numeric_literal();
				}
				break;
			case NAMED_PARAMETER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(NAMED_PARAMETER);
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				match(T__107);
				setState(1298);
				match(WORD);
				setState(1299);
				match(T__108);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_nameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(JPA2Parser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JPA2Parser.WORD, i);
		}
		public Constructor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterConstructor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitConstructor_name(this);
		}
	}

	public final Constructor_nameContext constructor_name() throws RecognitionException {
		Constructor_nameContext _localctx = new Constructor_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constructor_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(WORD);
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1305);
				match(T__12);
				setState(1306);
				match(WORD);
				}
				}
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_literalContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Enum_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEnum_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEnum_literal(this);
		}
	}

	public final Enum_literalContext enum_literal() throws RecognitionException {
		Enum_literalContext _localctx = new Enum_literalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enum_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_la = _input.LA(1);
			if ( !(_la==T__109 || _la==T__110) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Date_partContext date_part() {
			return getRuleContext(Date_partContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_field);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				match(WORD);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(T__0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1318);
				match(T__3);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(1319);
				match(T__33);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(1320);
				match(T__36);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(1321);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(1322);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(1323);
				match(T__31);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(1324);
				match(T__28);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 10);
				{
				setState(1325);
				match(T__27);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 11);
				{
				setState(1326);
				match(T__5);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 12);
				{
				setState(1327);
				match(T__61);
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 13);
				{
				setState(1328);
				match(T__93);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 14);
				{
				setState(1329);
				match(T__25);
				}
				break;
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__103:
			case T__104:
			case T__105:
				enterOuterAlt(_localctx, 15);
				{
				setState(1330);
				date_part();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identification_variableContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Identification_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterIdentification_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitIdentification_variable(this);
		}
	}

	public final Identification_variableContext identification_variable() throws RecognitionException {
		Identification_variableContext _localctx = new Identification_variableContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_identification_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(JPA2Parser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JPA2Parser.WORD, i);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_parameter_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(WORD);
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1336);
				match(T__12);
				setState(1337);
				match(WORD);
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Escape_characterContext extends ParserRuleContext {
		public TerminalNode TRIM_CHARACTER() { return getToken(JPA2Parser.TRIM_CHARACTER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JPA2Parser.STRING_LITERAL, 0); }
		public Escape_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEscape_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEscape_character(this);
		}
	}

	public final Escape_characterContext escape_character() throws RecognitionException {
		Escape_characterContext _localctx = new Escape_characterContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_escape_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			_la = _input.LA(1);
			if ( !(_la==TRIM_CHARACTER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_characterContext extends ParserRuleContext {
		public TerminalNode TRIM_CHARACTER() { return getToken(JPA2Parser.TRIM_CHARACTER, 0); }
		public Trim_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterTrim_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitTrim_character(this);
		}
	}

	public final Trim_characterContext trim_character() throws RecognitionException {
		Trim_characterContext _localctx = new Trim_characterContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_trim_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(TRIM_CHARACTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JPA2Parser.STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode INT_NUMERAL() { return getToken(JPA2Parser.INT_NUMERAL, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitNumeric_literal(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__111) {
				{
				setState(1349);
				match(T__111);
				}
			}

			setState(1352);
			match(INT_NUMERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_literalContext extends ParserRuleContext {
		public List<TerminalNode> INT_NUMERAL() { return getTokens(JPA2Parser.INT_NUMERAL); }
		public TerminalNode INT_NUMERAL(int i) {
			return getToken(JPA2Parser.INT_NUMERAL, i);
		}
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDecimal_literal(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_decimal_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(INT_NUMERAL);
			setState(1355);
			match(T__12);
			setState(1356);
			match(INT_NUMERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_valued_object_fieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Single_valued_object_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_valued_object_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSingle_valued_object_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSingle_valued_object_field(this);
		}
	}

	public final Single_valued_object_fieldContext single_valued_object_field() throws RecognitionException {
		Single_valued_object_fieldContext _localctx = new Single_valued_object_fieldContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_single_valued_object_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_valued_embeddable_object_fieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Single_valued_embeddable_object_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_valued_embeddable_object_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSingle_valued_embeddable_object_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSingle_valued_embeddable_object_field(this);
		}
	}

	public final Single_valued_embeddable_object_fieldContext single_valued_embeddable_object_field() throws RecognitionException {
		Single_valued_embeddable_object_fieldContext _localctx = new Single_valued_embeddable_object_fieldContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_single_valued_embeddable_object_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_valued_fieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Collection_valued_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_valued_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCollection_valued_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCollection_valued_field(this);
		}
	}

	public final Collection_valued_fieldContext collection_valued_field() throws RecognitionException {
		Collection_valued_fieldContext _localctx = new Collection_valued_fieldContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_collection_valued_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Entity_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEntity_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEntity_name(this);
		}
	}

	public final Entity_nameContext entity_name() throws RecognitionException {
		Entity_nameContext _localctx = new Entity_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_entity_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtypeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public SubtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSubtype(this);
		}
	}

	public final SubtypeContext subtype() throws RecognitionException {
		SubtypeContext _localctx = new SubtypeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_type_literalContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Entity_type_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_type_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEntity_type_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEntity_type_literal(this);
		}
	}

	public final Entity_type_literalContext entity_type_literal() throws RecognitionException {
		Entity_type_literalContext _localctx = new Entity_type_literalContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_entity_type_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JPA2Parser.STRING_LITERAL, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_fieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public State_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterState_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitState_field(this);
		}
	}

	public final State_fieldContext state_field() throws RecognitionException {
		State_fieldContext _localctx = new State_fieldContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_state_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_variableContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Result_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterResult_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitResult_variable(this);
		}
	}

	public final Result_variableContext result_variable() throws RecognitionException {
		Result_variableContext _localctx = new Result_variableContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_result_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superquery_identification_variableContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Superquery_identification_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superquery_identification_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSuperquery_identification_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSuperquery_identification_variable(this);
		}
	}

	public final Superquery_identification_variableContext superquery_identification_variable() throws RecognitionException {
		Superquery_identification_variableContext _localctx = new Superquery_identification_variableContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_superquery_identification_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_time_timestamp_literalContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JPA2Parser.WORD, 0); }
		public Date_time_timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_time_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterDate_time_timestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitDate_time_timestamp_literal(this);
		}
	}

	public final Date_time_timestamp_literalContext date_time_timestamp_literal() throws RecognitionException {
		Date_time_timestamp_literalContext _localctx = new Date_time_timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_date_time_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Pattern_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterPattern_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitPattern_value(this);
		}
	}

	public final Pattern_valueContext pattern_value() throws RecognitionException {
		Pattern_valueContext _localctx = new Pattern_valueContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_pattern_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_valued_input_parameterContext extends ParserRuleContext {
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Collection_valued_input_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_valued_input_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterCollection_valued_input_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitCollection_valued_input_parameter(this);
		}
	}

	public final Collection_valued_input_parameterContext collection_valued_input_parameter() throws RecognitionException {
		Collection_valued_input_parameterContext _localctx = new Collection_valued_input_parameterContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_collection_valued_input_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			input_parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_valued_input_parameterContext extends ParserRuleContext {
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Single_valued_input_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_valued_input_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterSingle_valued_input_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitSingle_valued_input_parameter(this);
		}
	}

	public final Single_valued_input_parameterContext single_valued_input_parameter() throws RecognitionException {
		Single_valued_input_parameterContext _localctx = new Single_valued_input_parameterContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_single_valued_input_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			input_parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_value_literalContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(JPA2Parser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JPA2Parser.WORD, i);
		}
		public Enum_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_value_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).enterEnum_value_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPA2Listener ) ((JPA2Listener)listener).exitEnum_value_literal(this);
		}
	}

	public final Enum_value_literalContext enum_value_literal() throws RecognitionException {
		Enum_value_literalContext _localctx = new Enum_value_literalContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_enum_value_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(WORD);
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1387);
				match(T__12);
				setState(1388);
				match(WORD);
				}
				}
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0092\u0575\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\3\2\3\2\3\2\5\2\u0110\n\2\3\3\3\3\3\3\3\3\5\3"+
		"\u0116\n\3\3\3\5\3\u0119\n\3\3\3\5\3\u011c\n\3\3\3\5\3\u011f\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\5\4\u0126\n\4\3\5\3\5\3\5\5\5\u012b\n\5\3\6\3\6\3\6\3\6"+
		"\7\6\u0131\n\6\f\6\16\6\u0134\13\6\3\7\3\7\5\7\u0138\n\7\3\b\3\b\7\b\u013c"+
		"\n\b\f\b\16\b\u013f\13\b\3\t\7\t\u0142\n\t\f\t\16\t\u0145\13\t\3\n\3\n"+
		"\5\n\u0149\n\n\3\13\3\13\5\13\u014d\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u0154"+
		"\n\f\3\f\3\f\3\f\5\f\u0159\n\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0161\n"+
		"\16\3\16\5\16\u0164\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u016d"+
		"\n\17\f\17\16\17\u0170\13\17\3\17\5\17\u0173\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u017b\n\17\f\17\16\17\u017e\13\17\3\17\5\17\u0181\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0188\n\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u018f\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0198\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01a2\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u01a9\n\23\f\23\16\23\u01ac\13\23\3\23\5\23\u01af\n\23\3\24"+
		"\3\24\5\24\u01b3\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u01ba\n\25\f\25\16"+
		"\25\u01bd\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u01c6\n\27\3\30"+
		"\3\30\3\30\3\31\5\31\u01cc\n\31\3\31\3\31\3\31\7\31\u01d1\n\31\f\31\16"+
		"\31\u01d4\13\31\3\32\3\32\5\32\u01d8\n\32\3\32\5\32\u01db\n\32\3\33\3"+
		"\33\3\33\5\33\u01e0\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01eb\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01f3\n\34\f\34\16"+
		"\34\u01f6\13\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u01fe\n\35\3\36\3\36"+
		"\3\36\5\36\u0203\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u020b\n\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0211\n\36\3\37\3\37\3 \3 \5 \u0217\n \3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\7\"\u0221\n\"\f\"\16\"\u0224\13\"\3#\3#\3#\5#\u0229"+
		"\n#\3$\3$\3$\3%\3%\3%\3%\3%\7%\u0233\n%\f%\16%\u0236\13%\3&\3&\5&\u023a"+
		"\n&\3&\5&\u023d\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0244\n\'\3(\3(\3)\3)\3*\3"+
		"*\3*\3*\3*\5*\u024f\n*\3*\5*\u0252\n*\3*\5*\u0255\n*\3*\3*\3+\3+\3+\3"+
		"+\7+\u025d\n+\f+\16+\u0260\13+\3,\3,\3,\5,\u0265\n,\3,\3,\7,\u0269\n,"+
		"\f,\16,\u026c\13,\3,\5,\u026f\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0279\n-\3"+
		".\3.\3.\3.\7.\u027f\n.\f.\16.\u0282\13.\5.\u0284\n.\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0294\n\61\f\61"+
		"\16\61\u0297\13\61\3\61\3\61\3\62\5\62\u029c\n\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\5\63\u02a4\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02ad"+
		"\n\64\3\65\3\65\3\65\7\65\u02b2\n\65\f\65\16\65\u02b5\13\65\3\66\3\66"+
		"\3\66\7\66\u02ba\n\66\f\66\16\66\u02bd\13\66\3\67\5\67\u02c0\n\67\3\67"+
		"\3\67\38\38\38\38\38\58\u02c9\n8\39\39\39\39\39\39\39\39\39\59\u02d4\n"+
		"9\3:\3:\3:\3:\3:\5:\u02db\n:\3;\3;\3;\3;\3;\3;\3;\5;\u02e4\n;\3;\3;\3"+
		";\3;\5;\u02ea\n;\3;\3;\3;\3;\5;\u02f0\n;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\5<\u02fd\n<\5<\u02ff\n<\3<\3<\5<\u0303\n<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u0310\n=\5=\u0312\n=\3=\3=\5=\u0316\n=\3=\3=\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\5>\u0323\n>\5>\u0325\n>\3>\3>\5>\u0329\n>\3>\3>\3?\3"+
		"?\3?\3?\3?\5?\u0332\n?\3?\3?\3@\3@\5@\u0338\n@\3@\3@\3@\3@\3@\3@\3@\5"+
		"@\u0341\n@\3@\3@\3@\3@\3@\3@\3@\5@\u034a\n@\3@\3@\3@\3@\3@\5@\u0351\n"+
		"@\3A\3A\3A\5A\u0356\nA\3A\5A\u0359\nA\3A\3A\3A\3A\3A\7A\u0360\nA\fA\16"+
		"A\u0363\13A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u036d\nA\3B\3B\3B\3B\5B\u0373\n"+
		"B\3C\3C\5C\u0377\nC\3C\3C\3C\3C\5C\u037d\nC\3C\3C\5C\u0381\nC\3D\3D\3"+
		"D\5D\u0386\nD\3D\3D\5D\u038a\nD\3D\3D\3E\3E\3E\5E\u0391\nE\3E\3E\3F\3"+
		"F\5F\u0397\nF\3F\3F\5F\u039b\nF\3F\3F\3G\3G\3G\5G\u03a2\nG\3H\3H\3H\5"+
		"H\u03a7\nH\3I\5I\u03aa\nI\3I\3I\3I\3J\3J\3J\3K\3K\3K\5K\u03b5\nK\3K\3"+
		"K\5K\u03b9\nK\3K\3K\3K\3K\5K\u03bf\nK\3K\3K\3K\3K\5K\u03c5\nK\3K\3K\3"+
		"K\3K\5K\u03cb\nK\3K\3K\3K\3K\5K\u03d1\nK\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03db"+
		"\nK\5K\u03dd\nK\3L\3L\3M\3M\3M\6M\u03e4\nM\rM\16M\u03e5\3M\5M\u03e9\n"+
		"M\3N\3N\3N\6N\u03ee\nN\rN\16N\u03ef\3N\5N\u03f3\nN\3O\5O\u03f6\nO\3O\3"+
		"O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0408\nP\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\5Q\u0413\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u041e\nR\3S\3"+
		"S\3S\3S\3S\3S\3S\5S\u0427\nS\3T\3T\3T\3T\3T\5T\u042e\nT\3U\3U\5U\u0432"+
		"\nU\3V\3V\5V\u0436\nV\3W\3W\3W\5W\u043b\nW\3X\3X\3X\3X\5X\u0441\nX\3X"+
		"\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u044f\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0469\nY\3Z\3Z\3["+
		"\3[\3[\3[\3[\3[\7[\u0473\n[\f[\16[\u0476\13[\3[\3[\3[\3[\3[\3[\3[\3[\5"+
		"[\u0480\n[\3[\3[\3[\3[\5[\u0486\n[\3[\5[\u0489\n[\3[\5[\u048c\n[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u049a\n[\3\\\3\\\3]\3]\3]\3]\7]\u04a2"+
		"\n]\f]\16]\u04a5\13]\3]\3]\3^\3^\3^\3^\5^\u04ad\n^\3_\3_\3_\3_\5_\u04b3"+
		"\n_\3`\3`\3`\7`\u04b8\n`\f`\16`\u04bb\13`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3"+
		"b\3b\3b\3b\7b\u04ca\nb\fb\16b\u04cd\13b\3b\3b\3b\3b\3c\3c\5c\u04d5\nc"+
		"\3d\3d\3d\3d\3d\3e\3e\3e\3e\6e\u04e0\ne\re\16e\u04e1\3e\3e\3f\3f\3f\3"+
		"f\3f\3f\3g\3g\3g\3g\3g\3g\3g\7g\u04f3\ng\fg\16g\u04f6\13g\3g\7g\u04f9"+
		"\ng\fg\16g\u04fc\13g\3g\3g\3g\3g\5g\u0502\ng\3h\3h\3h\3h\3h\3h\3i\3i\3"+
		"i\3i\3i\3j\3j\3k\3k\3k\3k\3k\3k\5k\u0517\nk\3l\3l\3m\3m\3m\7m\u051e\n"+
		"m\fm\16m\u0521\13m\3n\3n\3o\3o\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p"+
		"\3p\3p\5p\u0536\np\3q\3q\3r\3r\3r\7r\u053d\nr\fr\16r\u0540\13r\3s\3s\3"+
		"t\3t\3u\3u\3v\5v\u0549\nv\3v\3v\3w\3w\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3"+
		"|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\7\u0086\u0570\n\u0086\f\u0086\16\u0086\u0573\13\u0086\3\u0086"+
		"\2\2\u0087\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\2\22\3\2\30\33\3\2\36\"\3\2()\3\2*+\3\2\30\31"+
		"\3\2\60\65\3\2CE\4\2\25\25GG\4\2\25\25GK\3\2\32\33\3\2TV\3\2\\^\4\2\60"+
		"\65jl\3\2pq\4\2$$ww\3\2uv\2\u05f1\2\u010f\3\2\2\2\4\u0111\3\2\2\2\6\u0122"+
		"\3\2\2\2\b\u0127\3\2\2\2\n\u012c\3\2\2\2\f\u0137\3\2\2\2\16\u0139\3\2"+
		"\2\2\20\u0143\3\2\2\2\22\u0148\3\2\2\2\24\u014a\3\2\2\2\26\u0150\3\2\2"+
		"\2\30\u015a\3\2\2\2\32\u0163\3\2\2\2\34\u0187\3\2\2\2\36\u0189\3\2\2\2"+
		" \u0197\3\2\2\2\"\u01a1\3\2\2\2$\u01a3\3\2\2\2&\u01b2\3\2\2\2(\u01b4\3"+
		"\2\2\2*\u01be\3\2\2\2,\u01c5\3\2\2\2.\u01c7\3\2\2\2\60\u01cb\3\2\2\2\62"+
		"\u01d5\3\2\2\2\64\u01ea\3\2\2\2\66\u01ec\3\2\2\28\u01fd\3\2\2\2:\u0210"+
		"\3\2\2\2<\u0212\3\2\2\2>\u0216\3\2\2\2@\u0218\3\2\2\2B\u021b\3\2\2\2D"+
		"\u0228\3\2\2\2F\u022a\3\2\2\2H\u022d\3\2\2\2J\u0237\3\2\2\2L\u0243\3\2"+
		"\2\2N\u0245\3\2\2\2P\u0247\3\2\2\2R\u0249\3\2\2\2T\u0258\3\2\2\2V\u026e"+
		"\3\2\2\2X\u0278\3\2\2\2Z\u0283\3\2\2\2\\\u0285\3\2\2\2^\u0287\3\2\2\2"+
		"`\u028d\3\2\2\2b\u029b\3\2\2\2d\u02a3\3\2\2\2f\u02ac\3\2\2\2h\u02ae\3"+
		"\2\2\2j\u02b6\3\2\2\2l\u02bf\3\2\2\2n\u02c8\3\2\2\2p\u02d3\3\2\2\2r\u02da"+
		"\3\2\2\2t\u02dc\3\2\2\2v\u02f3\3\2\2\2x\u0306\3\2\2\2z\u0319\3\2\2\2|"+
		"\u032c\3\2\2\2~\u0350\3\2\2\2\u0080\u0355\3\2\2\2\u0082\u0372\3\2\2\2"+
		"\u0084\u0374\3\2\2\2\u0086\u0385\3\2\2\2\u0088\u038d\3\2\2\2\u008a\u0394"+
		"\3\2\2\2\u008c\u03a1\3\2\2\2\u008e\u03a6\3\2\2\2\u0090\u03a9\3\2\2\2\u0092"+
		"\u03ae\3\2\2\2\u0094\u03dc\3\2\2\2\u0096\u03de\3\2\2\2\u0098\u03e8\3\2"+
		"\2\2\u009a\u03f2\3\2\2\2\u009c\u03f5\3\2\2\2\u009e\u0407\3\2\2\2\u00a0"+
		"\u0412\3\2\2\2\u00a2\u041d\3\2\2\2\u00a4\u0426\3\2\2\2\u00a6\u042d\3\2"+
		"\2\2\u00a8\u0431\3\2\2\2\u00aa\u0435\3\2\2\2\u00ac\u043a\3\2\2\2\u00ae"+
		"\u043c\3\2\2\2\u00b0\u0468\3\2\2\2\u00b2\u046a\3\2\2\2\u00b4\u0499\3\2"+
		"\2\2\u00b6\u049b\3\2\2\2\u00b8\u049d\3\2\2\2\u00ba\u04ac\3\2\2\2\u00bc"+
		"\u04b2\3\2\2\2\u00be\u04b4\3\2\2\2\u00c0\u04c0\3\2\2\2\u00c2\u04c5\3\2"+
		"\2\2\u00c4\u04d4\3\2\2\2\u00c6\u04d6\3\2\2\2\u00c8\u04db\3\2\2\2\u00ca"+
		"\u04e5\3\2\2\2\u00cc\u0501\3\2\2\2\u00ce\u0503\3\2\2\2\u00d0\u0509\3\2"+
		"\2\2\u00d2\u050e\3\2\2\2\u00d4\u0516\3\2\2\2\u00d6\u0518\3\2\2\2\u00d8"+
		"\u051a\3\2\2\2\u00da\u0522\3\2\2\2\u00dc\u0524\3\2\2\2\u00de\u0535\3\2"+
		"\2\2\u00e0\u0537\3\2\2\2\u00e2\u0539\3\2\2\2\u00e4\u0541\3\2\2\2\u00e6"+
		"\u0543\3\2\2\2\u00e8\u0545\3\2\2\2\u00ea\u0548\3\2\2\2\u00ec\u054c\3\2"+
		"\2\2\u00ee\u0550\3\2\2\2\u00f0\u0552\3\2\2\2\u00f2\u0554\3\2\2\2\u00f4"+
		"\u0556\3\2\2\2\u00f6\u0558\3\2\2\2\u00f8\u055a\3\2\2\2\u00fa\u055c\3\2"+
		"\2\2\u00fc\u055e\3\2\2\2\u00fe\u0560\3\2\2\2\u0100\u0562\3\2\2\2\u0102"+
		"\u0564\3\2\2\2\u0104\u0566\3\2\2\2\u0106\u0568\3\2\2\2\u0108\u056a\3\2"+
		"\2\2\u010a\u056c\3\2\2\2\u010c\u0110\5\4\3\2\u010d\u0110\5\6\4\2\u010e"+
		"\u0110\5\b\5\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\3\3\2\2\2\u0111\u0112\7\3\2\2\u0112\u0113\5\60\31\2\u0113\u0115"+
		"\5\n\6\2\u0114\u0116\5@!\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0119\5B\"\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5F$\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5H%\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\2\2\3\u0121\5\3\2\2\2"+
		"\u0122\u0123\7\4\2\2\u0123\u0125\5(\25\2\u0124\u0126\5@!\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\7\3\2\2\2\u0127\u0128\7\5\2\2\u0128"+
		"\u012a\5.\30\2\u0129\u012b\5@!\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\t\3\2\2\2\u012c\u012d\7\6\2\2\u012d\u0132\5\16\b\2\u012e\u012f"+
		"\7\7\2\2\u012f\u0131\5\f\7\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\13\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0135\u0138\5\16\b\2\u0136\u0138\5\36\20\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\r\3\2\2\2\u0139\u013d\5\24\13\2\u013a\u013c\5\22"+
		"\n\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\17\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\5\22\n"+
		"\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\21\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0149\5\26\f\2\u0147"+
		"\u0149\5\30\r\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\23\3\2\2"+
		"\2\u014a\u014c\5\u00f4{\2\u014b\u014d\7\b\2\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\5\u00e0q\2\u014f\25\3\2"+
		"\2\2\u0150\u0151\5\32\16\2\u0151\u0153\5\34\17\2\u0152\u0154\7\b\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\5\u00e0"+
		"q\2\u0156\u0157\7\t\2\2\u0157\u0159\5h\65\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\27\3\2\2\2\u015a\u015b\5\32\16\2\u015b\u015c\7\n"+
		"\2\2\u015c\u015d\5\34\17\2\u015d\31\3\2\2\2\u015e\u0160\7\13\2\2\u015f"+
		"\u0161\7\f\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0164\7\r\2\2\u0163\u015e\3\2\2\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\16\2\2\u0166\33\3\2\2"+
		"\2\u0167\u0168\5\u00e0q\2\u0168\u016e\7\17\2\2\u0169\u016a\5\u00dep\2"+
		"\u016a\u016b\7\17\2\2\u016b\u016d\3\2\2\2\u016c\u0169\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0173\5\u00dep\2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0188\3\2\2\2\u0174\u0175\7\20\2\2\u0175\u0176\5\u00e0"+
		"q\2\u0176\u017c\7\17\2\2\u0177\u0178\5\u00dep\2\u0178\u0179\7\17\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0181\5\u00dep\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\7\b\2\2\u0183\u0184\5\u00f6|\2\u0184\u0185\7\u0080"+
		"\2\2\u0185\u0188\3\2\2\2\u0186\u0188\5\u00f4{\2\u0187\u0167\3\2\2\2\u0187"+
		"\u0174\3\2\2\2\u0187\u0186\3\2\2\2\u0188\35\3\2\2\2\u0189\u018a\7t\2\2"+
		"\u018a\u018b\7\177\2\2\u018b\u018c\5$\23\2\u018c\u018e\7\u0080\2\2\u018d"+
		"\u018f\7\b\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\5\u00e0q\2\u0191\37\3\2\2\2\u0192\u0198\5\"\22\2\u0193"+
		"\u0194\7\21\2\2\u0194\u0195\5\u00e0q\2\u0195\u0196\7\u0080\2\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0193\3\2\2\2\u0198!\3\2\2\2\u0199"+
		"\u019a\7\22\2\2\u019a\u019b\5\u00e0q\2\u019b\u019c\7\u0080\2\2\u019c\u01a2"+
		"\3\2\2\2\u019d\u019e\7\23\2\2\u019e\u019f\5\u00e0q\2\u019f\u01a0\7\u0080"+
		"\2\2\u01a0\u01a2\3\2\2\2\u01a1\u0199\3\2\2\2\u01a1\u019d\3\2\2\2\u01a2"+
		"#\3\2\2\2\u01a3\u01a4\5\u00e0q\2\u01a4\u01aa\7\17\2\2\u01a5\u01a6\5\u00de"+
		"p\2\u01a6\u01a7\7\17\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\5\u00dep\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af%\3\2\2\2\u01b0\u01b3\5\u00e0q\2\u01b1\u01b3\5\"\22"+
		"\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\'\3\2\2\2\u01b4\u01b5"+
		"\5\16\b\2\u01b5\u01b6\7\24\2\2\u01b6\u01bb\5*\26\2\u01b7\u01b8\7\7\2\2"+
		"\u01b8\u01ba\5*\26\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc)\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01bf\5$\23\2\u01bf\u01c0\7\25\2\2\u01c0\u01c1\5,\27\2\u01c1+\3\2\2\2"+
		"\u01c2\u01c6\5f\64\2\u01c3\u01c6\5\u00aaV\2\u01c4\u01c6\7\26\2\2\u01c5"+
		"\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6-\3\2\2\2"+
		"\u01c7\u01c8\7\6\2\2\u01c8\u01c9\5\16\b\2\u01c9/\3\2\2\2\u01ca\u01cc\7"+
		"\27\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01d2\5\62\32\2\u01ce\u01cf\7\7\2\2\u01cf\u01d1\5\62\32\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\61\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01da\5\64\33\2\u01d6\u01d8\7\b"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01db\5\u00fe\u0080\2\u01da\u01d7\3\2\2\2\u01da\u01db\3\2\2\2\u01db\63"+
		"\3\2\2\2\u01dc\u01df\5$\23\2\u01dd\u01de\t\2\2\2\u01de\u01e0\5f\64\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01eb\3\2\2\2\u01e1\u01eb\5\u00e0"+
		"q\2\u01e2\u01eb\5f\64\2\u01e3\u01eb\5:\36\2\u01e4\u01e5\7\34\2\2\u01e5"+
		"\u01e6\7\177\2\2\u01e6\u01e7\5\u00e0q\2\u01e7\u01e8\7\u0080\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01eb\5\66\34\2\u01ea\u01dc\3\2\2\2\u01ea\u01e1\3"+
		"\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\65\3\2\2\2\u01ec\u01ed\7\35\2\2\u01ed\u01ee\5\u00d8"+
		"m\2\u01ee\u01ef\7\177\2\2\u01ef\u01f4\58\35\2\u01f0\u01f1\7\7\2\2\u01f1"+
		"\u01f3\58\35\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7"+
		"\u01f8\7\u0080\2\2\u01f8\67\3\2\2\2\u01f9\u01fe\5$\23\2\u01fa\u01fe\5"+
		"f\64\2\u01fb\u01fe\5:\36\2\u01fc\u01fe\5\u00e0q\2\u01fd\u01f9\3\2\2\2"+
		"\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe9\3"+
		"\2\2\2\u01ff\u0200\5<\37\2\u0200\u0202\7\177\2\2\u0201\u0203\7\27\2\2"+
		"\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205"+
		"\5\u0098M\2\u0205\u0206\7\u0080\2\2\u0206\u0211\3\2\2\2\u0207\u0208\7"+
		"\36\2\2\u0208\u020a\7\177\2\2\u0209\u020b\7\27\2\2\u020a\u0209\3\2\2\2"+
		"\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5> \2\u020d\u020e"+
		"\7\u0080\2\2\u020e\u0211\3\2\2\2\u020f\u0211\5\u00b8]\2\u0210\u01ff\3"+
		"\2\2\2\u0210\u0207\3\2\2\2\u0210\u020f\3\2\2\2\u0211;\3\2\2\2\u0212\u0213"+
		"\t\3\2\2\u0213=\3\2\2\2\u0214\u0217\5\u00e0q\2\u0215\u0217\5$\23\2\u0216"+
		"\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217?\3\2\2\2\u0218\u0219\7#\2\2\u0219"+
		"\u021a\5h\65\2\u021aA\3\2\2\2\u021b\u021c\7$\2\2\u021c\u021d\7%\2\2\u021d"+
		"\u0222\5D#\2\u021e\u021f\7\7\2\2\u021f\u0221\5D#\2\u0220\u021e\3\2\2\2"+
		"\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223C\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0225\u0229\5$\23\2\u0226\u0229\5\u00e0q\2"+
		"\u0227\u0229\5\u00ceh\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229E\3\2\2\2\u022a\u022b\7&\2\2\u022b\u022c\5h\65\2\u022c"+
		"G\3\2\2\2\u022d\u022e\7\'\2\2\u022e\u022f\7%\2\2\u022f\u0234\5J&\2\u0230"+
		"\u0231\7\7\2\2\u0231\u0233\5J&\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235I\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0237\u0239\5L\'\2\u0238\u023a\5N(\2\u0239\u0238\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u023d\5P)\2\u023c\u023b\3\2\2"+
		"\2\u023c\u023d\3\2\2\2\u023dK\3\2\2\2\u023e\u0244\5$\23\2\u023f\u0244"+
		"\5&\24\2\u0240\u0244\5\u00fe\u0080\2\u0241\u0244\5f\64\2\u0242\u0244\5"+
		":\36\2\u0243\u023e\3\2\2\2\u0243\u023f\3\2\2\2\u0243\u0240\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244M\3\2\2\2\u0245\u0246\t\4\2\2"+
		"\u0246O\3\2\2\2\u0247\u0248\t\5\2\2\u0248Q\3\2\2\2\u0249\u024a\7\177\2"+
		"\2\u024a\u024b\7\3\2\2\u024b\u024c\5b\62\2\u024c\u024e\5T+\2\u024d\u024f"+
		"\5@!\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u0252\5B\"\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0255\5F$\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\7\u0080\2\2\u0257S\3\2\2\2\u0258\u0259\7\6\2\2\u0259"+
		"\u025e\5V,\2\u025a\u025b\7\7\2\2\u025b\u025d\5V,\2\u025c\u025a\3\2\2\2"+
		"\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025fU\3"+
		"\2\2\2\u0260\u025e\3\2\2\2\u0261\u026f\5\16\b\2\u0262\u0264\5X-\2\u0263"+
		"\u0265\7\b\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2"+
		"\2\2\u0266\u026a\5\u00e0q\2\u0267\u0269\5\26\f\2\u0268\u0267\3\2\2\2\u0269"+
		"\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026f\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026d\u026f\5`\61\2\u026e\u0261\3\2\2\2\u026e"+
		"\u0262\3\2\2\2\u026e\u026d\3\2\2\2\u026fW\3\2\2\2\u0270\u0271\5Z.\2\u0271"+
		"\u0272\7\17\2\2\u0272\u0273\5\u00eex\2\u0273\u0279\3\2\2\2\u0274\u0275"+
		"\5Z.\2\u0275\u0276\7\17\2\2\u0276\u0277\5\u00f2z\2\u0277\u0279\3\2\2\2"+
		"\u0278\u0270\3\2\2\2\u0278\u0274\3\2\2\2\u0279Y\3\2\2\2\u027a\u0284\5"+
		"\\/\2\u027b\u0280\5^\60\2\u027c\u027d\7\17\2\2\u027d\u027f\5\u00eex\2"+
		"\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u027a\3\2\2\2\u0283"+
		"\u027b\3\2\2\2\u0284[\3\2\2\2\u0285\u0286\5\u0100\u0081\2\u0286]\3\2\2"+
		"\2\u0287\u0288\7\20\2\2\u0288\u0289\5Z.\2\u0289\u028a\7\b\2\2\u028a\u028b"+
		"\5\u00f6|\2\u028b\u028c\7\u0080\2\2\u028c_\3\2\2\2\u028d\u028e\7t\2\2"+
		"\u028e\u028f\5\u0100\u0081\2\u028f\u0295\7\17\2\2\u0290\u0291\5\u00ee"+
		"x\2\u0291\u0292\7\17\2\2\u0292\u0294\3\2\2\2\u0293\u0290\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u0299\5\u00f2z\2\u0299a\3\2\2\2\u029a\u029c"+
		"\7\27\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2"+
		"\u029d\u029e\5d\63\2\u029ec\3\2\2\2\u029f\u02a4\5$\23\2\u02a0\u02a4\5"+
		"f\64\2\u02a1\u02a4\5:\36\2\u02a2\u02a4\5\u00e0q\2\u02a3\u029f\3\2\2\2"+
		"\u02a3\u02a0\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4e\3"+
		"\2\2\2\u02a5\u02ad\5\u0098M\2\u02a6\u02ad\5\u00a0Q\2\u02a7\u02ad\5\u00a6"+
		"T\2\u02a8\u02ad\5\u00a2R\2\u02a9\u02ad\5\u00a4S\2\u02aa\u02ad\5\u00bc"+
		"_\2\u02ab\u02ad\5\u00acW\2\u02ac\u02a5\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac"+
		"\u02a7\3\2\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ac\u02ab\3\2\2\2\u02adg\3\2\2\2\u02ae\u02b3\5j\66\2\u02af\u02b0"+
		"\7,\2\2\u02b0\u02b2\5j\66\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4i\3\2\2\2\u02b5\u02b3\3\2\2\2"+
		"\u02b6\u02bb\5l\67\2\u02b7\u02b8\7-\2\2\u02b8\u02ba\5l\67\2\u02b9\u02b7"+
		"\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"k\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c0\7s\2\2\u02bf\u02be\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\5n8\2\u02c2m\3\2\2\2\u02c3"+
		"\u02c9\5p9\2\u02c4\u02c5\7\177\2\2\u02c5\u02c6\5h\65\2\u02c6\u02c7\7\u0080"+
		"\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9"+
		"o\3\2\2\2\u02ca\u02d4\5\u0094K\2\u02cb\u02d4\5~@\2\u02cc\u02d4\5\u0080"+
		"A\2\u02cd\u02d4\5\u0084C\2\u02ce\u02d4\5\u0086D\2\u02cf\u02d4\5\u0088"+
		"E\2\u02d0\u02d4\5\u008aF\2\u02d1\u02d4\5\u0090I\2\u02d2\u02d4\5r:\2\u02d3"+
		"\u02ca\3\2\2\2\u02d3\u02cb\3\2\2\2\u02d3\u02cc\3\2\2\2\u02d3\u02cd\3\2"+
		"\2\2\u02d3\u02ce\3\2\2\2\u02d3\u02cf\3\2\2\2\u02d3\u02d0\3\2\2\2\u02d3"+
		"\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4q\3\2\2\2\u02d5\u02db\5t;\2\u02d6"+
		"\u02db\5v<\2\u02d7\u02db\5x=\2\u02d8\u02db\5z>\2\u02d9\u02db\5|?\2\u02da"+
		"\u02d5\3\2\2\2\u02da\u02d6\3\2\2\2\u02da\u02d7\3\2\2\2\u02da\u02d8\3\2"+
		"\2\2\u02da\u02d9\3\2\2\2\u02dbs\3\2\2\2\u02dc\u02dd\7.\2\2\u02dd\u02de"+
		"\7\177\2\2\u02de\u02df\5$\23\2\u02df\u02e0\7\7\2\2\u02e0\u02e3\7/\2\2"+
		"\u02e1\u02e2\t\6\2\2\u02e2\u02e4\5\u00eav\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\7\7\2\2\u02e6\u02e9\7/"+
		"\2\2\u02e7\u02e8\t\6\2\2\u02e8\u02ea\5\u00eav\2\u02e9\u02e7\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7\7\2\2\u02ec\u02ef\t\7"+
		"\2\2\u02ed\u02ee\7\7\2\2\u02ee\u02f0\7\66\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\7\u0080\2\2\u02f2u\3\2"+
		"\2\2\u02f3\u02f4\7\67\2\2\u02f4\u02f5\7\177\2\2\u02f5\u02f6\5$\23\2\u02f6"+
		"\u02fe\7\7\2\2\u02f7\u02ff\5$\23\2\u02f8\u02ff\5\u00d4k\2\u02f9\u02fc"+
		"\7/\2\2\u02fa\u02fb\t\6\2\2\u02fb\u02fd\5\u00eav\2\u02fc\u02fa\3\2\2\2"+
		"\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02f7\3\2\2\2\u02fe\u02f8"+
		"\3\2\2\2\u02fe\u02f9\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u0301\7\7\2\2\u0301"+
		"\u0303\7\66\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3"+
		"\2\2\2\u0304\u0305\7\u0080\2\2\u0305w\3\2\2\2\u0306\u0307\78\2\2\u0307"+
		"\u0308\7\177\2\2\u0308\u0309\5$\23\2\u0309\u0311\7\7\2\2\u030a\u0312\5"+
		"$\23\2\u030b\u0312\5\u00d4k\2\u030c\u030f\7/\2\2\u030d\u030e\t\6\2\2\u030e"+
		"\u0310\5\u00eav\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312"+
		"\3\2\2\2\u0311\u030a\3\2\2\2\u0311\u030b\3\2\2\2\u0311\u030c\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0314\7\7\2\2\u0314\u0316\7\66\2\2\u0315\u0313\3"+
		"\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7\u0080\2\2"+
		"\u0318y\3\2\2\2\u0319\u031a\79\2\2\u031a\u031b\7\177\2\2\u031b\u031c\5"+
		"$\23\2\u031c\u0324\7\7\2\2\u031d\u0325\5$\23\2\u031e\u0325\5\u00d4k\2"+
		"\u031f\u0322\7/\2\2\u0320\u0321\t\6\2\2\u0321\u0323\5\u00eav\2\u0322\u0320"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u031d\3\2\2\2\u0324"+
		"\u031e\3\2\2\2\u0324\u031f\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0327\7\7"+
		"\2\2\u0327\u0329\7\66\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032b\7\u0080\2\2\u032b{\3\2\2\2\u032c\u032d\7:\2"+
		"\2\u032d\u032e\7\177\2\2\u032e\u0331\5$\23\2\u032f\u0330\7\7\2\2\u0330"+
		"\u0332\7\66\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3"+
		"\2\2\2\u0333\u0334\7\u0080\2\2\u0334}\3\2\2\2\u0335\u0337\5\u0098M\2\u0336"+
		"\u0338\7s\2\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2"+
		"\2\2\u0339\u033a\7;\2\2\u033a\u033b\5\u0098M\2\u033b\u033c\7-\2\2\u033c"+
		"\u033d\5\u0098M\2\u033d\u0351\3\2\2\2\u033e\u0340\5\u00a0Q\2\u033f\u0341"+
		"\7s\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0343\7;\2\2\u0343\u0344\5\u00a0Q\2\u0344\u0345\7-\2\2\u0345\u0346\5"+
		"\u00a0Q\2\u0346\u0351\3\2\2\2\u0347\u0349\5\u00a2R\2\u0348\u034a\7s\2"+
		"\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c"+
		"\7;\2\2\u034c\u034d\5\u00a2R\2\u034d\u034e\7-\2\2\u034e\u034f\5\u00a2"+
		"R\2\u034f\u0351\3\2\2\2\u0350\u0335\3\2\2\2\u0350\u033e\3\2\2\2\u0350"+
		"\u0347\3\2\2\2\u0351\177\3\2\2\2\u0352\u0356\5$\23\2\u0353\u0356\5\u00ae"+
		"X\2\u0354\u0356\5\u00e0q\2\u0355\u0352\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0354\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0359\7s\2\2\u0358\u0357\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u036c\7t\2\2\u035b"+
		"\u035c\7\177\2\2\u035c\u0361\5\u0082B\2\u035d\u035e\7\7\2\2\u035e\u0360"+
		"\5\u0082B\2\u035f\u035d\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2"+
		"\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365"+
		"\7\u0080\2\2\u0365\u036d\3\2\2\2\u0366\u036d\5R*\2\u0367\u036d\5\u0106"+
		"\u0084\2\u0368\u0369\7\177\2\2\u0369\u036a\5$\23\2\u036a\u036b\7\u0080"+
		"\2\2\u036b\u036d\3\2\2\2\u036c\u035b\3\2\2\2\u036c\u0366\3\2\2\2\u036c"+
		"\u0367\3\2\2\2\u036c\u0368\3\2\2\2\u036d\u0081\3\2\2\2\u036e\u0373\5\u00e8"+
		"u\2\u036f\u0373\5\u00eav\2\u0370\u0373\5\u0108\u0085\2\u0371\u0373\5\u00d0"+
		"i\2\u0372\u036e\3\2\2\2\u0372\u036f\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0371\3\2\2\2\u0373\u0083\3\2\2\2\u0374\u0376\5\u00a0Q\2\u0375\u0377"+
		"\7s\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037c\7<\2\2\u0379\u037d\5\u00a0Q\2\u037a\u037d\5\u0104\u0083\2\u037b"+
		"\u037d\5\u00d4k\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b"+
		"\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037f\7=\2\2\u037f\u0381\5\u00e4s\2"+
		"\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0085\3\2\2\2\u0382\u0386"+
		"\5$\23\2\u0383\u0386\5\u00d4k\2\u0384\u0386\5\34\17\2\u0385\u0382\3\2"+
		"\2\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u0389\7>\2\2\u0388\u038a\7s\2\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2"+
		"\2\u038a\u038b\3\2\2\2\u038b\u038c\7\26\2\2\u038c\u0087\3\2\2\2\u038d"+
		"\u038e\5$\23\2\u038e\u0390\7>\2\2\u038f\u0391\7s\2\2\u0390\u038f\3\2\2"+
		"\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\7?\2\2\u0393\u0089"+
		"\3\2\2\2\u0394\u0396\5\u008cG\2\u0395\u0397\7s\2\2\u0396\u0395\3\2\2\2"+
		"\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\7@\2\2\u0399\u039b"+
		"\7A\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\5$\23\2\u039d\u008b\3\2\2\2\u039e\u03a2\5$\23\2\u039f\u03a2\5\u008e"+
		"H\2\u03a0\u03a2\5R*\2\u03a1\u039e\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a0"+
		"\3\2\2\2\u03a2\u008d\3\2\2\2\u03a3\u03a7\5\u00e0q\2\u03a4\u03a7\5\u00d4"+
		"k\2\u03a5\u03a7\5\u00d6l\2\u03a6\u03a3\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a5\3\2\2\2\u03a7\u008f\3\2\2\2\u03a8\u03aa\7s\2\2\u03a9\u03a8\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\7B\2\2\u03ac"+
		"\u03ad\5R*\2\u03ad\u0091\3\2\2\2\u03ae\u03af\t\b\2\2\u03af\u03b0\5R*\2"+
		"\u03b0\u0093\3\2\2\2\u03b1\u03b4\5\u00a0Q\2\u03b2\u03b5\5\u0096L\2\u03b3"+
		"\u03b5\7F\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2"+
		"\2\2\u03b6\u03b9\5\u00a0Q\2\u03b7\u03b9\5\u0092J\2\u03b8\u03b6\3\2\2\2"+
		"\u03b8\u03b7\3\2\2\2\u03b9\u03dd\3\2\2\2\u03ba\u03bb\5\u00a4S\2\u03bb"+
		"\u03be\t\t\2\2\u03bc\u03bf\5\u00a4S\2\u03bd\u03bf\5\u0092J\2\u03be\u03bc"+
		"\3\2\2\2\u03be\u03bd\3\2\2\2\u03bf\u03dd\3\2\2\2\u03c0\u03c1\5\u00a6T"+
		"\2\u03c1\u03c4\t\t\2\2\u03c2\u03c5\5\u00a6T\2\u03c3\u03c5\5\u0092J\2\u03c4"+
		"\u03c2\3\2\2\2\u03c4\u03c3\3\2\2\2\u03c5\u03dd\3\2\2\2\u03c6\u03c7\5\u00a2"+
		"R\2\u03c7\u03ca\5\u0096L\2\u03c8\u03cb\5\u00a2R\2\u03c9\u03cb\5\u0092"+
		"J\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cb\u03dd\3\2\2\2\u03cc"+
		"\u03cd\5\u00a8U\2\u03cd\u03d0\t\t\2\2\u03ce\u03d1\5\u00a8U\2\u03cf\u03d1"+
		"\5\u0092J\2\u03d0\u03ce\3\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u03dd\3\2\2"+
		"\2\u03d2\u03d3\5\u00acW\2\u03d3\u03d4\t\t\2\2\u03d4\u03d5\5\u00acW\2\u03d5"+
		"\u03dd\3\2\2\2\u03d6\u03d7\5\u0098M\2\u03d7\u03da\5\u0096L\2\u03d8\u03db"+
		"\5\u0098M\2\u03d9\u03db\5\u0092J\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2"+
		"\2\2\u03db\u03dd\3\2\2\2\u03dc\u03b1\3\2\2\2\u03dc\u03ba\3\2\2\2\u03dc"+
		"\u03c0\3\2\2\2\u03dc\u03c6\3\2\2\2\u03dc\u03cc\3\2\2\2\u03dc\u03d2\3\2"+
		"\2\2\u03dc\u03d6\3\2\2\2\u03dd\u0095\3\2\2\2\u03de\u03df\t\n\2\2\u03df"+
		"\u0097\3\2\2\2\u03e0\u03e3\5\u009aN\2\u03e1\u03e2\t\6\2\2\u03e2\u03e4"+
		"\5\u009aN\2\u03e3\u03e1\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e3\3\2\2"+
		"\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e9\5\u009aN\2\u03e8"+
		"\u03e0\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9\u0099\3\2\2\2\u03ea\u03ed\5\u009c"+
		"O\2\u03eb\u03ec\t\13\2\2\u03ec\u03ee\5\u009cO\2\u03ed\u03eb\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f3\3\2"+
		"\2\2\u03f1\u03f3\5\u009cO\2\u03f2\u03ea\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3"+
		"\u009b\3\2\2\2\u03f4\u03f6\t\6\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\5\u009eP\2\u03f8\u009d\3\2\2\2\u03f9"+
		"\u0408\5$\23\2\u03fa\u0408\5\u00ecw\2\u03fb\u0408\5\u00eav\2\u03fc\u03fd"+
		"\7\177\2\2\u03fd\u03fe\5\u0098M\2\u03fe\u03ff\7\u0080\2\2\u03ff\u0408"+
		"\3\2\2\2\u0400\u0408\5\u00d4k\2\u0401\u0408\5\u00b0Y\2\u0402\u0408\5:"+
		"\36\2\u0403\u0408\5\u00bc_\2\u0404\u0408\5\u00b8]\2\u0405\u0408\5\u00cc"+
		"g\2\u0406\u0408\5R*\2\u0407\u03f9\3\2\2\2\u0407\u03fa\3\2\2\2\u0407\u03fb"+
		"\3\2\2\2\u0407\u03fc\3\2\2\2\u0407\u0400\3\2\2\2\u0407\u0401\3\2\2\2\u0407"+
		"\u0402\3\2\2\2\u0407\u0403\3\2\2\2\u0407\u0404\3\2\2\2\u0407\u0405\3\2"+
		"\2\2\u0407\u0406\3\2\2\2\u0408\u009f\3\2\2\2\u0409\u0413\5$\23\2\u040a"+
		"\u0413\5\u00e8u\2\u040b\u0413\5\u00d4k\2\u040c\u0413\5\u00b4[\2\u040d"+
		"\u0413\5:\36\2\u040e\u0413\5\u00bc_\2\u040f\u0413\5\u00b8]\2\u0410\u0413"+
		"\5\u00ccg\2\u0411\u0413\5R*\2\u0412\u0409\3\2\2\2\u0412\u040a\3\2\2\2"+
		"\u0412\u040b\3\2\2\2\u0412\u040c\3\2\2\2\u0412\u040d\3\2\2\2\u0412\u040e"+
		"\3\2\2\2\u0412\u040f\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413"+
		"\u00a1\3\2\2\2\u0414\u041e\5$\23\2\u0415\u041e\5\u00d4k\2\u0416\u041e"+
		"\5\u00b2Z\2\u0417\u041e\5:\36\2\u0418\u041e\5\u00bc_\2\u0419\u041e\5\u00b8"+
		"]\2\u041a\u041e\5\u00ccg\2\u041b\u041e\5\u0102\u0082\2\u041c\u041e\5R"+
		"*\2\u041d\u0414\3\2\2\2\u041d\u0415\3\2\2\2\u041d\u0416\3\2\2\2\u041d"+
		"\u0417\3\2\2\2\u041d\u0418\3\2\2\2\u041d\u0419\3\2\2\2\u041d\u041a\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041d\u041c\3\2\2\2\u041e\u00a3\3\2\2\2\u041f"+
		"\u0427\5$\23\2\u0420\u0427\5\u00dco\2\u0421\u0427\5\u00d4k\2\u0422\u0427"+
		"\5\u00bc_\2\u0423\u0427\5\u00b8]\2\u0424\u0427\5\u00ccg\2\u0425\u0427"+
		"\5R*\2\u0426\u041f\3\2\2\2\u0426\u0420\3\2\2\2\u0426\u0421\3\2\2\2\u0426"+
		"\u0422\3\2\2\2\u0426\u0423\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0425\3\2"+
		"\2\2\u0427\u00a5\3\2\2\2\u0428\u042e\5$\23\2\u0429\u042e\5\u00dan\2\u042a"+
		"\u042e\5\u00d4k\2\u042b\u042e\5\u00bc_\2\u042c\u042e\5R*\2\u042d\u0428"+
		"\3\2\2\2\u042d\u0429\3\2\2\2\u042d\u042a\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042c\3\2\2\2\u042e\u00a7\3\2\2\2\u042f\u0432\5$\23\2\u0430\u0432\5\u00aa"+
		"V\2\u0431\u042f\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u00a9\3\2\2\2\u0433"+
		"\u0436\5\u00e0q\2\u0434\u0436\5\u00d4k\2\u0435\u0433\3\2\2\2\u0435\u0434"+
		"\3\2\2\2\u0436\u00ab\3\2\2\2\u0437\u043b\5\u00aeX\2\u0438\u043b\5\u00f8"+
		"}\2\u0439\u043b\5\u00d4k\2\u043a\u0437\3\2\2\2\u043a\u0438\3\2\2\2\u043a"+
		"\u0439\3\2\2\2\u043b\u00ad\3\2\2\2\u043c\u0440\7L\2\2\u043d\u0441\5&\24"+
		"\2\u043e\u0441\5$\23\2\u043f\u0441\5\u00d4k\2\u0440\u043d\3\2\2\2\u0440"+
		"\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\7\u0080"+
		"\2\2\u0443\u00af\3\2\2\2\u0444\u0445\7M\2\2\u0445\u0446\5\u00a0Q\2\u0446"+
		"\u0447\7\u0080\2\2\u0447\u0469\3\2\2\2\u0448\u0449\7N\2\2\u0449\u044a"+
		"\5\u00a0Q\2\u044a\u044b\7\7\2\2\u044b\u044e\5\u00a0Q\2\u044c\u044d\7\7"+
		"\2\2\u044d\u044f\5\u0098M\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0450\3\2\2\2\u0450\u0451\7\u0080\2\2\u0451\u0469\3\2\2\2\u0452\u0453"+
		"\7O\2\2\u0453\u0454\5\u0098M\2\u0454\u0455\7\u0080\2\2\u0455\u0469\3\2"+
		"\2\2\u0456\u0457\7P\2\2\u0457\u0458\5\u0098M\2\u0458\u0459\7\u0080\2\2"+
		"\u0459\u0469\3\2\2\2\u045a\u045b\7Q\2\2\u045b\u045c\5\u0098M\2\u045c\u045d"+
		"\7\7\2\2\u045d\u045e\5\u0098M\2\u045e\u045f\7\u0080\2\2\u045f\u0469\3"+
		"\2\2\2\u0460\u0461\7R\2\2\u0461\u0462\5$\23\2\u0462\u0463\7\u0080\2\2"+
		"\u0463\u0469\3\2\2\2\u0464\u0465\7S\2\2\u0465\u0466\5\u00e0q\2\u0466\u0467"+
		"\7\u0080\2\2\u0467\u0469\3\2\2\2\u0468\u0444\3\2\2\2\u0468\u0448\3\2\2"+
		"\2\u0468\u0452\3\2\2\2\u0468\u0456\3\2\2\2\u0468\u045a\3\2\2\2\u0468\u0460"+
		"\3\2\2\2\u0468\u0464\3\2\2\2\u0469\u00b1\3\2\2\2\u046a\u046b\t\f\2\2\u046b"+
		"\u00b3\3\2\2\2\u046c\u046d\7W\2\2\u046d\u046e\5\u00a0Q\2\u046e\u046f\7"+
		"\7\2\2\u046f\u0474\5\u00a0Q\2\u0470\u0471\7\7\2\2\u0471\u0473\5\u00a0"+
		"Q\2\u0472\u0470\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0478\7\u0080"+
		"\2\2\u0478\u049a\3\2\2\2\u0479\u047a\7X\2\2\u047a\u047b\5\u00a0Q\2\u047b"+
		"\u047c\7\7\2\2\u047c\u047f\5\u0098M\2\u047d\u047e\7\7\2\2\u047e\u0480"+
		"\5\u0098M\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2"+
		"\2\u0481\u0482\7\u0080\2\2\u0482\u049a\3\2\2\2\u0483\u048b\7Y\2\2\u0484"+
		"\u0486\5\u00b6\\\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488"+
		"\3\2\2\2\u0487\u0489\5\u00e6t\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u048a\3\2\2\2\u048a\u048c\7\6\2\2\u048b\u0485\3\2\2\2\u048b\u048c"+
		"\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\5\u00a0Q\2\u048e\u048f\7\u0080"+
		"\2\2\u048f\u049a\3\2\2\2\u0490\u0491\7Z\2\2\u0491\u0492\7\177\2\2\u0492"+
		"\u0493\5\u00a0Q\2\u0493\u0494\7\u0080\2\2\u0494\u049a\3\2\2\2\u0495\u0496"+
		"\7[\2\2\u0496\u0497\5\u00a0Q\2\u0497\u0498\7\u0080\2\2\u0498\u049a\3\2"+
		"\2\2\u0499\u046c\3\2\2\2\u0499\u0479\3\2\2\2\u0499\u0483\3\2\2\2\u0499"+
		"\u0490\3\2\2\2\u0499\u0495\3\2\2\2\u049a\u00b5\3\2\2\2\u049b\u049c\t\r"+
		"\2\2\u049c\u00b7\3\2\2\2\u049d\u049e\7_\2\2\u049e\u04a3\5\u00fa~\2\u049f"+
		"\u04a0\7\7\2\2\u04a0\u04a2\5\u00ba^\2\u04a1\u049f\3\2\2\2\u04a2\u04a5"+
		"\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a6\u04a7\7\u0080\2\2\u04a7\u00b9\3\2\2\2\u04a8\u04ad"+
		"\5\u00d6l\2\u04a9\u04ad\5$\23\2\u04aa\u04ad\5\u00d4k\2\u04ab\u04ad\5f"+
		"\64\2\u04ac\u04a8\3\2\2\2\u04ac\u04a9\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac"+
		"\u04ab\3\2\2\2\u04ad\u00bb\3\2\2\2\u04ae\u04b3\5\u00be`\2\u04af\u04b3"+
		"\5\u00c2b\2\u04b0\u04b3\5\u00c8e\2\u04b1\u04b3\5\u00caf\2\u04b2\u04ae"+
		"\3\2\2\2\u04b2\u04af\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3"+
		"\u00bd\3\2\2\2\u04b4\u04b5\7`\2\2\u04b5\u04b9\5\u00c0a\2\u04b6\u04b8\5"+
		"\u00c0a\2\u04b7\u04b6\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04bd"+
		"\7a\2\2\u04bd\u04be\5f\64\2\u04be\u04bf\7b\2\2\u04bf\u00bf\3\2\2\2\u04c0"+
		"\u04c1\7c\2\2\u04c1\u04c2\5h\65\2\u04c2\u04c3\7d\2\2\u04c3\u04c4\5f\64"+
		"\2\u04c4\u00c1\3\2\2\2\u04c5\u04c6\7`\2\2\u04c6\u04c7\5\u00c4c\2\u04c7"+
		"\u04cb\5\u00c6d\2\u04c8\u04ca\5\u00c6d\2\u04c9\u04c8\3\2\2\2\u04ca\u04cd"+
		"\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd"+
		"\u04cb\3\2\2\2\u04ce\u04cf\7a\2\2\u04cf\u04d0\5f\64\2\u04d0\u04d1\7b\2"+
		"\2\u04d1\u00c3\3\2\2\2\u04d2\u04d5\5$\23\2\u04d3\u04d5\5\u00aeX\2\u04d4"+
		"\u04d2\3\2\2\2\u04d4\u04d3\3\2\2\2\u04d5\u00c5\3\2\2\2\u04d6\u04d7\7c"+
		"\2\2\u04d7\u04d8\5f\64\2\u04d8\u04d9\7d\2\2\u04d9\u04da\5f\64\2\u04da"+
		"\u00c7\3\2\2\2\u04db\u04dc\7e\2\2\u04dc\u04df\5f\64\2\u04dd\u04de\7\7"+
		"\2\2\u04de\u04e0\5f\64\2\u04df\u04dd\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\7\u0080"+
		"\2\2\u04e4\u00c9\3\2\2\2\u04e5\u04e6\7f\2\2\u04e6\u04e7\5f\64\2\u04e7"+
		"\u04e8\7\7\2\2\u04e8\u04e9\5f\64\2\u04e9\u04ea\7\u0080\2\2\u04ea\u00cb"+
		"\3\2\2\2\u04eb\u04ec\7g\2\2\u04ec\u04ed\5\u00ba^\2\u04ed\u04fa\7w\2\2"+
		"\u04ee\u04ef\7\177\2\2\u04ef\u04f4\7~\2\2\u04f0\u04f1\7\7\2\2\u04f1\u04f3"+
		"\7~\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04f9\7\u0080"+
		"\2\2\u04f8\u04ee\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa"+
		"\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04fe\7\u0080"+
		"\2\2\u04fe\u0502\3\2\2\2\u04ff\u0502\5\u00ceh\2\u0500\u0502\5\u00d0i\2"+
		"\u0501\u04eb\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0500\3\2\2\2\u0502\u00cd"+
		"\3\2\2\2\u0503\u0504\7h\2\2\u0504\u0505\5\u00d2j\2\u0505\u0506\7\6\2\2"+
		"\u0506\u0507\5\u00ba^\2\u0507\u0508\7\u0080\2\2\u0508\u00cf\3\2\2\2\u0509"+
		"\u050a\7i\2\2\u050a\u050b\7\177\2\2\u050b\u050c\5\u010a\u0086\2\u050c"+
		"\u050d\7\u0080\2\2\u050d\u00d1\3\2\2\2\u050e\u050f\t\16\2\2\u050f\u00d3"+
		"\3\2\2\2\u0510\u0511\7m\2\2\u0511\u0517\5\u00eav\2\u0512\u0517\7y\2\2"+
		"\u0513\u0514\7n\2\2\u0514\u0515\7w\2\2\u0515\u0517\7o\2\2\u0516\u0510"+
		"\3\2\2\2\u0516\u0512\3\2\2\2\u0516\u0513\3\2\2\2\u0517\u00d5\3\2\2\2\u0518"+
		"\u0519\7w\2\2\u0519\u00d7\3\2\2\2\u051a\u051f\7w\2\2\u051b\u051c\7\17"+
		"\2\2\u051c\u051e\7w\2\2\u051d\u051b\3\2\2\2\u051e\u0521\3\2\2\2\u051f"+
		"\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u00d9\3\2\2\2\u0521\u051f\3\2"+
		"\2\2\u0522\u0523\7w\2\2\u0523\u00db\3\2\2\2\u0524\u0525\t\17\2\2\u0525"+
		"\u00dd\3\2\2\2\u0526\u0536\7w\2\2\u0527\u0536\7\3\2\2\u0528\u0536\7\6"+
		"\2\2\u0529\u0536\7$\2\2\u052a\u0536\7\'\2\2\u052b\u0536\7 \2\2\u052c\u0536"+
		"\7!\2\2\u052d\u0536\7\"\2\2\u052e\u0536\7\37\2\2\u052f\u0536\7\36\2\2"+
		"\u0530\u0536\7\b\2\2\u0531\u0536\7@\2\2\u0532\u0536\7`\2\2\u0533\u0536"+
		"\7\34\2\2\u0534\u0536\5\u00d2j\2\u0535\u0526\3\2\2\2\u0535\u0527\3\2\2"+
		"\2\u0535\u0528\3\2\2\2\u0535\u0529\3\2\2\2\u0535\u052a\3\2\2\2\u0535\u052b"+
		"\3\2\2\2\u0535\u052c\3\2\2\2\u0535\u052d\3\2\2\2\u0535\u052e\3\2\2\2\u0535"+
		"\u052f\3\2\2\2\u0535\u0530\3\2\2\2\u0535\u0531\3\2\2\2\u0535\u0532\3\2"+
		"\2\2\u0535\u0533\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u00df\3\2\2\2\u0537"+
		"\u0538\t\20\2\2\u0538\u00e1\3\2\2\2\u0539\u053e\7w\2\2\u053a\u053b\7\17"+
		"\2\2\u053b\u053d\7w\2\2\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2\u053e"+
		"\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u00e3\3\2\2\2\u0540\u053e\3\2"+
		"\2\2\u0541\u0542\t\21\2\2\u0542\u00e5\3\2\2\2\u0543\u0544\7u\2\2\u0544"+
		"\u00e7\3\2\2\2\u0545\u0546\7v\2\2\u0546\u00e9\3\2\2\2\u0547\u0549\7r\2"+
		"\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b"+
		"\7~\2\2\u054b\u00eb\3\2\2\2\u054c\u054d\7~\2\2\u054d\u054e\7\17\2\2\u054e"+
		"\u054f\7~\2\2\u054f\u00ed\3\2\2\2\u0550\u0551\7w\2\2\u0551\u00ef\3\2\2"+
		"\2\u0552\u0553\7w\2\2\u0553\u00f1\3\2\2\2\u0554\u0555\7w\2\2\u0555\u00f3"+
		"\3\2\2\2\u0556\u0557\7w\2\2\u0557\u00f5\3\2\2\2\u0558\u0559\7w\2\2\u0559"+
		"\u00f7\3\2\2\2\u055a\u055b\7w\2\2\u055b\u00f9\3\2\2\2\u055c\u055d\7v\2"+
		"\2\u055d\u00fb\3\2\2\2\u055e\u055f\7w\2\2\u055f\u00fd\3\2\2\2\u0560\u0561"+
		"\7w\2\2\u0561\u00ff\3\2\2\2\u0562\u0563\7w\2\2\u0563\u0101\3\2\2\2\u0564"+
		"\u0565\7w\2\2\u0565\u0103\3\2\2\2\u0566\u0567\5\u00e8u\2\u0567\u0105\3"+
		"\2\2\2\u0568\u0569\5\u00d4k\2\u0569\u0107\3\2\2\2\u056a\u056b\5\u00d4"+
		"k\2\u056b\u0109\3\2\2\2\u056c\u0571\7w\2\2\u056d\u056e\7\17\2\2\u056e"+
		"\u0570\7w\2\2\u056f\u056d\3\2\2\2\u0570\u0573\3\2\2\2\u0571\u056f\3\2"+
		"\2\2\u0571\u0572\3\2\2\2\u0572\u010b\3\2\2\2\u0573\u0571\3\2\2\2\u0095"+
		"\u010f\u0115\u0118\u011b\u011e\u0125\u012a\u0132\u0137\u013d\u0143\u0148"+
		"\u014c\u0153\u0158\u0160\u0163\u016e\u0172\u017c\u0180\u0187\u018e\u0197"+
		"\u01a1\u01aa\u01ae\u01b2\u01bb\u01c5\u01cb\u01d2\u01d7\u01da\u01df\u01ea"+
		"\u01f4\u01fd\u0202\u020a\u0210\u0216\u0222\u0228\u0234\u0239\u023c\u0243"+
		"\u024e\u0251\u0254\u025e\u0264\u026a\u026e\u0278\u0280\u0283\u0295\u029b"+
		"\u02a3\u02ac\u02b3\u02bb\u02bf\u02c8\u02d3\u02da\u02e3\u02e9\u02ef\u02fc"+
		"\u02fe\u0302\u030f\u0311\u0315\u0322\u0324\u0328\u0331\u0337\u0340\u0349"+
		"\u0350\u0355\u0358\u0361\u036c\u0372\u0376\u037c\u0380\u0385\u0389\u0390"+
		"\u0396\u039a\u03a1\u03a6\u03a9\u03b4\u03b8\u03be\u03c4\u03ca\u03d0\u03da"+
		"\u03dc\u03e5\u03e8\u03ef\u03f2\u03f5\u0407\u0412\u041d\u0426\u042d\u0431"+
		"\u0435\u043a\u0440\u044e\u0468\u0474\u047f\u0485\u0488\u048b\u0499\u04a3"+
		"\u04ac\u04b2\u04b9\u04cb\u04d4\u04e1\u04f4\u04fa\u0501\u0516\u051f\u0535"+
		"\u053e\u0548\u0571";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}