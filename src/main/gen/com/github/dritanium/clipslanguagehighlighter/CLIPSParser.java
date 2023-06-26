// This is a generated file. Not intended for manual editing.
package com.github.dritanium.clipslanguagehighlighter;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.dritanium.clipslanguagehighlighter.psi.CLIPSTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CLIPSParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return clipsFile(b, l + 1);
  }

  /* ********************************************************** */
  // <single-field-LHS-slot> | <multifield-LHS-slot>
  public static boolean LHS_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LHS_slot")) return false;
    if (!nextTokenIs(b, "<lhs slot>", _MULTIFIELD_LHS_SLOT_, _SINGLE_FIELD_LHS_SLOT_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LHS_SLOT, "<lhs slot>");
    r = single_field_LHS_slot(b, l + 1);
    if (!r) r = multifield_LHS_slot(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <variable> | <constant> | <function-call>
  public static boolean RHS_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RHS_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS_FIELD, "<rhs field>");
    r = variable(b, l + 1);
    if (!r) r = constant(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <ordered-RHS-pattern> | <template-RHS-pattern>
  public static boolean RHS_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RHS_pattern")) return false;
    if (!nextTokenIs(b, "<rhs pattern>", _ORDERED_RHS_PATTERN_, _TEMPLATE_RHS_PATTERN_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS_PATTERN, "<rhs pattern>");
    r = ordered_RHS_pattern(b, l + 1);
    if (!r) r = template_RHS_pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <single-field-RHS-slot> | <multifield-RHS-slot>
  public static boolean RHS_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RHS_slot")) return false;
    if (!nextTokenIs(b, "<rhs slot>", _MULTIFIELD_RHS_SLOT_, _SINGLE_FIELD_RHS_SLOT_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS_SLOT, "<rhs slot>");
    r = single_field_RHS_slot(b, l + 1);
    if (!r) r = multifield_RHS_slot(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'access' ('read-write' | 'read-only' | 'initialize-only') ')'
  public static boolean access_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACCESS_FACET, "<access facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "access");
    r = r && access_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'read-write' | 'read-only' | 'initialize-only'
  private static boolean access_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "read-write");
    if (!r) r = consumeToken(b, "read-only");
    if (!r) r = consumeToken(b, "initialize-only");
    return r;
  }

  /* ********************************************************** */
  // <expression>
  public static boolean action(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action")) return false;
    if (!nextTokenIs(b, _EXPRESSION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, ACTION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'allowed-symbols' <symbol-list> ')' |
  // '(' 'allowed-strings' <string-list> ')' |
  // '(' 'allowed-lexemes' <lexeme-list> ')' |
  // '(' 'allowed-integers' <integer-list> ')' |
  // '(' 'allowed-floats' <float-list> ')' |
  // '(' 'allowed-numbers' <number-list> ')' |
  // '(' 'allowed-instance-names' <instance-name-list> ')' |
  // '(' 'allowed-classes' <class-name-list> ')' |
  // '(' 'allowed-values' <value-list> ')'
  public static boolean allowed_constant_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALLOWED_CONSTANT_ATTRIBUTE, "<allowed constant attribute>");
    r = allowed_constant_attribute_0(b, l + 1);
    if (!r) r = allowed_constant_attribute_1(b, l + 1);
    if (!r) r = allowed_constant_attribute_2(b, l + 1);
    if (!r) r = allowed_constant_attribute_3(b, l + 1);
    if (!r) r = allowed_constant_attribute_4(b, l + 1);
    if (!r) r = allowed_constant_attribute_5(b, l + 1);
    if (!r) r = allowed_constant_attribute_6(b, l + 1);
    if (!r) r = allowed_constant_attribute_7(b, l + 1);
    if (!r) r = allowed_constant_attribute_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'allowed-symbols' <symbol-list> ')'
  private static boolean allowed_constant_attribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-symbols");
    r = r && symbol_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-strings' <string-list> ')'
  private static boolean allowed_constant_attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-strings");
    r = r && string_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-lexemes' <lexeme-list> ')'
  private static boolean allowed_constant_attribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-lexemes");
    r = r && lexeme_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-integers' <integer-list> ')'
  private static boolean allowed_constant_attribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-integers");
    r = r && integer_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-floats' <float-list> ')'
  private static boolean allowed_constant_attribute_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-floats");
    r = r && float_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-numbers' <number-list> ')'
  private static boolean allowed_constant_attribute_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-numbers");
    r = r && number_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-instance-names' <instance-name-list> ')'
  private static boolean allowed_constant_attribute_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-instance-names");
    r = r && instance_name_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-classes' <class-name-list> ')'
  private static boolean allowed_constant_attribute_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-classes");
    r = r && class_name_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'allowed-values' <value-list> ')'
  private static boolean allowed_constant_attribute_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_constant_attribute_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "allowed-values");
    r = r && value_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'SYMBOL' | 'STRING' | 'LEXEME' | 'INTEGER' | 'FLOAT' | 'NUMBER' | 'INSTANCE-NAME' | 'INSTANCE-ADDRESS' | 'INSTANCE' | 'EXTERNAL-ADDRESS' | 'FACT-ADDRESS'
  public static boolean allowed_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allowed_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALLOWED_TYPE, "<allowed type>");
    r = consumeToken(b, "SYMBOL");
    if (!r) r = consumeToken(b, "STRING");
    if (!r) r = consumeToken(b, "LEXEME");
    if (!r) r = consumeToken(b, "INTEGER");
    if (!r) r = consumeToken(b, "FLOAT");
    if (!r) r = consumeToken(b, "NUMBER");
    if (!r) r = consumeToken(b, "INSTANCE-NAME");
    if (!r) r = consumeToken(b, "INSTANCE-ADDRESS");
    if (!r) r = consumeToken(b, "INSTANCE");
    if (!r) r = consumeToken(b, "EXTERNAL-ADDRESS");
    if (!r) r = consumeToken(b, "FACT-ADDRESS");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'and' <conditional-element>+ ')'
  public static boolean and_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_CE, "<and ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "and");
    r = r && and_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <conditional-element>+
  private static boolean and_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_CE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_element(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!conditional_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_CE_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <single-field-variable> '<-' <pattern-CE>
  public static boolean assigned_pattern_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assigned_pattern_CE")) return false;
    if (!nextTokenIs(b, _SINGLE_FIELD_VARIABLE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_field_variable(b, l + 1);
    r = r && consumeToken(b, "<-");
    r = r && pattern_CE(b, l + 1);
    exit_section_(b, m, ASSIGNED_PATTERN_CE, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'is-a' <constraint> ')' | '(' 'name' <constraint> ')' | '(' <slot-name> <constraint>* ')'
  public static boolean attribute_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_CONSTRAINT, "<attribute constraint>");
    r = attribute_constraint_0(b, l + 1);
    if (!r) r = attribute_constraint_1(b, l + 1);
    if (!r) r = attribute_constraint_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'is-a' <constraint> ')'
  private static boolean attribute_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_constraint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "is-a");
    r = r && constraint(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'name' <constraint> ')'
  private static boolean attribute_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "name");
    r = r && constraint(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <slot-name> <constraint>* ')'
  private static boolean attribute_constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_constraint_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && slot_name(b, l + 1);
    r = r && attribute_constraint_2_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <constraint>*
  private static boolean attribute_constraint_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_constraint_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constraint(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_constraint_2_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'TRUE' | 'FALSE'
  public static boolean boolean_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_SYMBOL, "<boolean symbol>");
    r = consumeToken(b, "TRUE");
    if (!r) r = consumeToken(b, "FALSE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'cardinality' <cardinality-specification> <cardinality-specification> ')'
  public static boolean cardinality_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cardinality_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CARDINALITY_ATTRIBUTE, "<cardinality attribute>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "cardinality");
    r = r && cardinality_specification(b, l + 1);
    r = r && cardinality_specification(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <integer> | '?VARIABLE'
  public static boolean cardinality_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cardinality_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CARDINALITY_SPECIFICATION, "<cardinality specification>");
    r = consumeToken(b, _INTEGER_);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean class_name_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_expression")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, CLASS_NAME_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // <class-name>+ | '?VARIABLE'
  public static boolean class_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_NAME_LIST, "<class name list>");
    r = class_name_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <class-name>+
  private static boolean class_name_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!class_name(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_name_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean clipsFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clipsFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clipsFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <string>
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, _STRING_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _STRING_);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // <pattern-CE> | <assigned-pattern-CE> | <not-CE> | <and-CE> | <or-CE> | <logical-CE> | <test-CE> | <exists-CE> | <forall-CE>
  public static boolean conditional_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_ELEMENT, "<conditional element>");
    r = pattern_CE(b, l + 1);
    if (!r) r = assigned_pattern_CE(b, l + 1);
    if (!r) r = not_CE(b, l + 1);
    if (!r) r = and_CE(b, l + 1);
    if (!r) r = or_CE(b, l + 1);
    if (!r) r = logical_CE(b, l + 1);
    if (!r) r = test_CE(b, l + 1);
    if (!r) r = exists_CE(b, l + 1);
    if (!r) r = forall_CE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <single-constraint> | <single-constraint> '&' <connected-constraint> | <single-constraint> '|' <connected-constraint>
  public static boolean connected_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connected_constraint")) return false;
    if (!nextTokenIs(b, _SINGLE_CONSTRAINT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_constraint(b, l + 1);
    if (!r) r = connected_constraint_1(b, l + 1);
    if (!r) r = connected_constraint_2(b, l + 1);
    exit_section_(b, m, CONNECTED_CONSTRAINT, r);
    return r;
  }

  // <single-constraint> '&' <connected-constraint>
  private static boolean connected_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connected_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_constraint(b, l + 1);
    r = r && consumeToken(b, "&");
    r = r && connected_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <single-constraint> '|' <connected-constraint>
  private static boolean connected_constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connected_constraint_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_constraint(b, l + 1);
    r = r && consumeToken(b, "|");
    r = r && connected_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol> | <string> | <integer> | <float> | <instance-name>
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = consumeToken(b, _SYMBOL_);
    if (!r) r = consumeToken(b, _STRING_);
    if (!r) r = consumeToken(b, _INTEGER_);
    if (!r) r = consumeToken(b, _FLOAT_);
    if (!r) r = instance_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?' | '$?' | <connected-constraint>
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = consumeToken(b, "?");
    if (!r) r = consumeToken(b, "$?");
    if (!r) r = connected_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <type-attribute> | <allowed-constant-attribute> | <range-attribute> | <cardinality-attribute>
  public static boolean constraint_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT_ATTRIBUTE, "<constraint attribute>");
    r = type_attribute(b, l + 1);
    if (!r) r = allowed_constant_attribute(b, l + 1);
    if (!r) r = range_attribute(b, l + 1);
    if (!r) r = cardinality_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean construct_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, CONSTRUCT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'create-accessor' ('?NONE' | 'read' | 'write' | 'read-write') ')'
  public static boolean create_accessor_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_accessor_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATE_ACCESSOR_FACET, "<create accessor facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "create-accessor");
    r = r && create_accessor_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '?NONE' | 'read' | 'write' | 'read-write'
  private static boolean create_accessor_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_accessor_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "?NONE");
    if (!r) r = consumeToken(b, "read");
    if (!r) r = consumeToken(b, "write");
    if (!r) r = consumeToken(b, "read-write");
    return r;
  }

  /* ********************************************************** */
  // '(' 'declare' <rule-property>+ ')'
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "declare");
    r = r && declaration_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <rule-property>+
  private static boolean declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_property(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!rule_property(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'default' ('?DERIVE' | '?NONE' | <expression>*) ')' |
  //                         '(' 'default-dynamic' <expression>* ')'
  public static boolean default_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_ATTRIBUTE, "<default attribute>");
    r = default_attribute_0(b, l + 1);
    if (!r) r = default_attribute_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'default' ('?DERIVE' | '?NONE' | <expression>*) ')'
  private static boolean default_attribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_attribute_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "default");
    r = r && default_attribute_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '?DERIVE' | '?NONE' | <expression>*
  private static boolean default_attribute_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_attribute_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "?DERIVE");
    if (!r) r = consumeToken(b, "?NONE");
    if (!r) r = default_attribute_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <expression>*
  private static boolean default_attribute_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_attribute_0_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "default_attribute_0_2_2", c)) break;
    }
    return true;
  }

  // '(' 'default-dynamic' <expression>* ')'
  private static boolean default_attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_attribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "default-dynamic");
    r = r && default_attribute_1_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <expression>*
  private static boolean default_attribute_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_attribute_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "default_attribute_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'default' ('?DERIVE' | '?NONE' | <expression>*) ')' | '(' 'default-dynamic' <expression>* ')'
  public static boolean default_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_FACET, "<default facet>");
    r = default_facet_0(b, l + 1);
    if (!r) r = default_facet_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'default' ('?DERIVE' | '?NONE' | <expression>*) ')'
  private static boolean default_facet_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_facet_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "default");
    r = r && default_facet_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '?DERIVE' | '?NONE' | <expression>*
  private static boolean default_facet_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_facet_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "?DERIVE");
    if (!r) r = consumeToken(b, "?NONE");
    if (!r) r = default_facet_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <expression>*
  private static boolean default_facet_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_facet_0_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "default_facet_0_2_2", c)) break;
    }
    return true;
  }

  // '(' 'default-dynamic' <expression>* ')'
  private static boolean default_facet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_facet_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "default-dynamic");
    r = r && default_facet_1_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <expression>*
  private static boolean default_facet_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_facet_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "default_facet_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'defclass' <name> [<comment>] '(' 'is-a' <superclass-name>+ ')' [<role>] [<pattern-match-role>] <slot>* <handler-documentation>* ')'
  public static boolean defclass_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFCLASS_CONSTRUCT, "<defclass construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defclass");
    r = r && consumeToken(b, _NAME_);
    r = r && defclass_construct_3(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, "is-a");
    r = r && defclass_construct_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && defclass_construct_8(b, l + 1);
    r = r && defclass_construct_9(b, l + 1);
    r = r && defclass_construct_10(b, l + 1);
    r = r && defclass_construct_11(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<comment>]
  private static boolean defclass_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  // <superclass-name>+
  private static boolean defclass_construct_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = superclass_name(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!superclass_name(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defclass_construct_6", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // [<role>]
  private static boolean defclass_construct_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct_8")) return false;
    role(b, l + 1);
    return true;
  }

  // [<pattern-match-role>]
  private static boolean defclass_construct_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct_9")) return false;
    pattern_match_role(b, l + 1);
    return true;
  }

  // <slot>*
  private static boolean defclass_construct_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct_10")) return false;
    while (true) {
      int c = current_position_(b);
      if (!slot(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defclass_construct_10", c)) break;
    }
    return true;
  }

  // <handler-documentation>*
  private static boolean defclass_construct_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defclass_construct_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!handler_documentation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defclass_construct_11", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'deffacts' <deffacts-name> [ <comment> ] <RHS-pattern>* ')'
  public static boolean deffacts_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffacts_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFFACTS_CONSTRUCT, "<deffacts construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "deffacts");
    r = r && deffacts_name(b, l + 1);
    r = r && deffacts_construct_3(b, l + 1);
    r = r && deffacts_construct_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <comment> ]
  private static boolean deffacts_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffacts_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  // <RHS-pattern>*
  private static boolean deffacts_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffacts_construct_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RHS_pattern(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deffacts_construct_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean deffacts_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffacts_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, DEFFACTS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'deffunction' <name> [<comment>] '(' <regular-parameter>* [<wildcard-parameter>] ')' <action>* ')'
  public static boolean deffunction_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffunction_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFFUNCTION_CONSTRUCT, "<deffunction construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "deffunction");
    r = r && consumeToken(b, _NAME_);
    r = r && deffunction_construct_3(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && deffunction_construct_5(b, l + 1);
    r = r && deffunction_construct_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && deffunction_construct_8(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<comment>]
  private static boolean deffunction_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffunction_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  // <regular-parameter>*
  private static boolean deffunction_construct_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffunction_construct_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!regular_parameter(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deffunction_construct_5", c)) break;
    }
    return true;
  }

  // [<wildcard-parameter>]
  private static boolean deffunction_construct_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffunction_construct_6")) return false;
    wildcard_parameter(b, l + 1);
    return true;
  }

  // <action>*
  private static boolean deffunction_construct_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deffunction_construct_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!action(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deffunction_construct_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'defgeneric' <name>  [<comment>] ')'
  public static boolean defgeneric_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defgeneric_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFGENERIC_CONSTRUCT, "<defgeneric construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defgeneric");
    r = r && consumeToken(b, _NAME_);
    r = r && defgeneric_construct_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<comment>]
  private static boolean defgeneric_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defgeneric_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' 'defglobal'  [<defmodule-name>] <global-assignment>* ')'
  public static boolean defglobal_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defglobal_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFGLOBAL_CONSTRUCT, "<defglobal construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defglobal");
    r = r && defglobal_construct_2(b, l + 1);
    r = r && defglobal_construct_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<defmodule-name>]
  private static boolean defglobal_construct_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defglobal_construct_2")) return false;
    defmodule_name(b, l + 1);
    return true;
  }

  // <global-assignment>*
  private static boolean defglobal_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defglobal_construct_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!global_assignment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defglobal_construct_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'definstances' <definstances-name> ['active'] [<comment>] <instance-template>* ')'
  public static boolean definstances_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definstances_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINSTANCES_CONSTRUCT, "<definstances construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "definstances");
    r = r && definstances_name(b, l + 1);
    r = r && definstances_construct_3(b, l + 1);
    r = r && definstances_construct_4(b, l + 1);
    r = r && definstances_construct_5(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['active']
  private static boolean definstances_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definstances_construct_3")) return false;
    consumeToken(b, "active");
    return true;
  }

  // [<comment>]
  private static boolean definstances_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definstances_construct_4")) return false;
    comment(b, l + 1);
    return true;
  }

  // <instance-template>*
  private static boolean definstances_construct_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definstances_construct_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instance_template(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "definstances_construct_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean definstances_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definstances_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, DEFINSTANCES_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'defmessage-handler' <class-name> <message-name> [<handler-type>] [<comment>] '('<parameter>* [<wildcard-parameter>]')' <action>*')'
  public static boolean defmessage_handler_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmessage_handler_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFMESSAGE_HANDLER_CONSTRUCT, "<defmessage handler construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defmessage-handler");
    r = r && class_name(b, l + 1);
    r = r && message_name(b, l + 1);
    r = r && defmessage_handler_construct_4(b, l + 1);
    r = r && defmessage_handler_construct_5(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && defmessage_handler_construct_7(b, l + 1);
    r = r && defmessage_handler_construct_8(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && defmessage_handler_construct_10(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<handler-type>]
  private static boolean defmessage_handler_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmessage_handler_construct_4")) return false;
    handler_type(b, l + 1);
    return true;
  }

  // [<comment>]
  private static boolean defmessage_handler_construct_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmessage_handler_construct_5")) return false;
    comment(b, l + 1);
    return true;
  }

  // <parameter>*
  private static boolean defmessage_handler_construct_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmessage_handler_construct_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defmessage_handler_construct_7", c)) break;
    }
    return true;
  }

  // [<wildcard-parameter>]
  private static boolean defmessage_handler_construct_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmessage_handler_construct_8")) return false;
    wildcard_parameter(b, l + 1);
    return true;
  }

  // <action>*
  private static boolean defmessage_handler_construct_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmessage_handler_construct_10")) return false;
    while (true) {
      int c = current_position_(b);
      if (!action(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defmessage_handler_construct_10", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'defmethod' <name> [<index>] [<comment>] '(' <parameter-restriction>* [<wildcard-parameter-restriction>] ')' <action>* ')'
  public static boolean defmethod_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmethod_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFMETHOD_CONSTRUCT, "<defmethod construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defmethod");
    r = r && consumeToken(b, _NAME_);
    r = r && defmethod_construct_3(b, l + 1);
    r = r && defmethod_construct_4(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && defmethod_construct_6(b, l + 1);
    r = r && defmethod_construct_7(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && defmethod_construct_9(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<index>]
  private static boolean defmethod_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmethod_construct_3")) return false;
    consumeToken(b, _INDEX_);
    return true;
  }

  // [<comment>]
  private static boolean defmethod_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmethod_construct_4")) return false;
    comment(b, l + 1);
    return true;
  }

  // <parameter-restriction>*
  private static boolean defmethod_construct_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmethod_construct_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter_restriction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defmethod_construct_6", c)) break;
    }
    return true;
  }

  // [<wildcard-parameter-restriction>]
  private static boolean defmethod_construct_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmethod_construct_7")) return false;
    wildcard_parameter_restriction(b, l + 1);
    return true;
  }

  // <action>*
  private static boolean defmethod_construct_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmethod_construct_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!action(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defmethod_construct_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'defmodule' <module-name> <comment>? <port-specification>* ')'
  public static boolean defmodule_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmodule_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFMODULE_CONSTRUCT, "<defmodule construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defmodule");
    r = r && module_name(b, l + 1);
    r = r && defmodule_construct_3(b, l + 1);
    r = r && defmodule_construct_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <comment>?
  private static boolean defmodule_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmodule_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  // <port-specification>*
  private static boolean defmodule_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmodule_construct_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!port_specification(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defmodule_construct_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean defmodule_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmodule_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, DEFMODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'defrule' <rule-name> [<comment>] [<declaration>] <conditional-element>* '=>' <action>* ')'
  public static boolean defrule_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defrule_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFRULE_CONSTRUCT, "<defrule construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "defrule");
    r = r && rule_name(b, l + 1);
    r = r && defrule_construct_3(b, l + 1);
    r = r && defrule_construct_4(b, l + 1);
    r = r && defrule_construct_5(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && defrule_construct_7(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<comment>]
  private static boolean defrule_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defrule_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  // [<declaration>]
  private static boolean defrule_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defrule_construct_4")) return false;
    declaration(b, l + 1);
    return true;
  }

  // <conditional-element>*
  private static boolean defrule_construct_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defrule_construct_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defrule_construct_5", c)) break;
    }
    return true;
  }

  // <action>*
  private static boolean defrule_construct_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defrule_construct_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!action(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "defrule_construct_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'deftemplate' <deftemplate-name> [ <comment> ] <slot-definition>* ')'
  public static boolean deftemplate_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftemplate_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFTEMPLATE_CONSTRUCT, "<deftemplate construct>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "deftemplate");
    r = r && deftemplate_name(b, l + 1);
    r = r && deftemplate_construct_3(b, l + 1);
    r = r && deftemplate_construct_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <comment> ]
  private static boolean deftemplate_construct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftemplate_construct_3")) return false;
    comment(b, l + 1);
    return true;
  }

  // <slot-definition>*
  private static boolean deftemplate_construct_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftemplate_construct_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!slot_definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "deftemplate_construct_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean deftemplate_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deftemplate_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, DEFTEMPLATE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'exists' <conditional-element>+ ')'
  public static boolean exists_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exists_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXISTS_CE, "<exists ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "exists");
    r = r && exists_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <conditional-element>+
  private static boolean exists_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exists_CE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_element(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!conditional_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exists_CE_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <constant> | <variable> | <function-call>
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = constant(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <default-facet> | <storage-facet> | <access-facet> | <propagation-facet> | <source-facet> | <pattern-match-facet> | <visibility-facet> | <create-accessor-facet> <override-message-facet> | <constraint-attribute>
  public static boolean facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACET, "<facet>");
    r = default_facet(b, l + 1);
    if (!r) r = storage_facet(b, l + 1);
    if (!r) r = access_facet(b, l + 1);
    if (!r) r = propagation_facet(b, l + 1);
    if (!r) r = source_facet(b, l + 1);
    if (!r) r = pattern_match_facet(b, l + 1);
    if (!r) r = visibility_facet(b, l + 1);
    if (!r) r = create_accessor_facet(b, l + 1);
    if (!r) r = constraint_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <float>+ | '?VARIABLE'
  public static boolean float_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT_LIST, "<float list>");
    r = float_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <float>+
  private static boolean float_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _FLOAT_);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, _FLOAT_)) break;
      if (!empty_element_parsed_guard_(b, "float_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'forall' <conditional-element> <conditional-element>+ ')'
  public static boolean forall_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forall_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORALL_CE, "<forall ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "forall");
    r = r && conditional_element(b, l + 1);
    r = r && forall_CE_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <conditional-element>+
  private static boolean forall_CE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forall_CE_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_element(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!conditional_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forall_CE_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <function-name> <expression>* ')'
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, "<function call>");
    r = consumeToken(b, "(");
    r = r && function_name(b, l + 1);
    r = r && function_call_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <expression>*
  private static boolean function_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean function_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <global-variable> '=' <expression>
  public static boolean global_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_assignment")) return false;
    if (!nextTokenIs(b, _GLOBAL_VARIABLE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_variable(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expression(b, l + 1);
    exit_section_(b, m, GLOBAL_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // '?*'<symbol>'*'
  public static boolean global_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_VARIABLE, "<global variable>");
    r = consumeToken(b, "?*");
    r = r && consumeToken(b, _SYMBOL_);
    r = r && consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'message-handler' <name> [<handler-type>] ')'
  public static boolean handler_documentation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handler_documentation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HANDLER_DOCUMENTATION, "<handler documentation>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "message-handler");
    r = r && consumeToken(b, _NAME_);
    r = r && handler_documentation_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [<handler-type>]
  private static boolean handler_documentation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handler_documentation_3")) return false;
    handler_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'primary' | 'around' | 'before' | 'after'
  public static boolean handler_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "handler_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HANDLER_TYPE, "<handler type>");
    r = consumeToken(b, "primary");
    if (!r) r = consumeToken(b, "around");
    if (!r) r = consumeToken(b, "before");
    if (!r) r = consumeToken(b, "after");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <instance-name-expression> 'of' <class-name-expression> <slot-override>*
  public static boolean instance_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_definition")) return false;
    if (!nextTokenIs(b, _INSTANCE_NAME_EXPRESSION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instance_name_expression(b, l + 1);
    r = r && consumeToken(b, "of");
    r = r && class_name_expression(b, l + 1);
    r = r && instance_definition_3(b, l + 1);
    exit_section_(b, m, INSTANCE_DEFINITION, r);
    return r;
  }

  // <slot-override>*
  private static boolean instance_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!slot_override(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instance_definition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean instance_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, INSTANCE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean instance_name_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_name_expression")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, INSTANCE_NAME_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // <instance-name>+ | '?VARIABLE'
  public static boolean instance_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_name_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANCE_NAME_LIST, "<instance name list>");
    r = instance_name_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <instance-name>+
  private static boolean instance_name_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_name_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instance_name(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!instance_name(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instance_name_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '('<instance-definition>')'
  public static boolean instance_template(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_template")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANCE_TEMPLATE, "<instance template>");
    r = consumeToken(b, "(");
    r = r && instance_definition(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <expression>
  public static boolean integer_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_expression")) return false;
    if (!nextTokenIs(b, _EXPRESSION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, INTEGER_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // <integer>+ | '?VARIABLE'
  public static boolean integer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LIST, "<integer list>");
    r = integer_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <integer>+
  private static boolean integer_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _INTEGER_);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, _INTEGER_)) break;
      if (!empty_element_parsed_guard_(b, "integer_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <deffacts-construct>|<deftemplate-construct>| <defglobal-construct>| <defrule-construct>| <deffunction-construct>| <defgeneric-construct>| <defmethod-construct>| <defclass-construct>| <definstances-construct>| <defmessage-handler-construct>|<defmodule-construct>
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = deffacts_construct(b, l + 1);
    if (!r) r = deftemplate_construct(b, l + 1);
    if (!r) r = defglobal_construct(b, l + 1);
    if (!r) r = defrule_construct(b, l + 1);
    if (!r) r = deffunction_construct(b, l + 1);
    if (!r) r = defgeneric_construct(b, l + 1);
    if (!r) r = defmethod_construct(b, l + 1);
    if (!r) r = defclass_construct(b, l + 1);
    if (!r) r = definstances_construct(b, l + 1);
    if (!r) r = defmessage_handler_construct(b, l + 1);
    if (!r) r = defmodule_construct(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <symbol> | <string>
  public static boolean lexeme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexeme")) return false;
    if (!nextTokenIs(b, "<lexeme>", _STRING_, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEXEME, "<lexeme>");
    r = consumeToken(b, _SYMBOL_);
    if (!r) r = consumeToken(b, _STRING_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <lexeme>+ | '?VARIABLE'
  public static boolean lexeme_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexeme_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEXEME_LIST, "<lexeme list>");
    r = lexeme_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <lexeme>+
  private static boolean lexeme_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexeme_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lexeme(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!lexeme(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lexeme_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'logical' <conditional-element>+ ')'
  public static boolean logical_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_CE, "<logical ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "logical");
    r = r && logical_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <conditional-element>+
  private static boolean logical_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_CE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_element(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!conditional_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_CE_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean message_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, MESSAGE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean module_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, MODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <slot-name> <constraint>* ')'
  public static boolean multifield_LHS_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multifield_LHS_slot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIFIELD_LHS_SLOT, "<multifield lhs slot>");
    r = consumeToken(b, "(");
    r = r && slot_name(b, l + 1);
    r = r && multifield_LHS_slot_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <constraint>*
  private static boolean multifield_LHS_slot_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multifield_LHS_slot_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constraint(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multifield_LHS_slot_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' <slot-name> <RHS-field>* ')'
  public static boolean multifield_RHS_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multifield_RHS_slot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIFIELD_RHS_SLOT, "<multifield rhs slot>");
    r = consumeToken(b, "(");
    r = r && slot_name(b, l + 1);
    r = r && multifield_RHS_slot_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <RHS-field>*
  private static boolean multifield_RHS_slot_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multifield_RHS_slot_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RHS_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multifield_RHS_slot_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '$?'<variable-symbol>
  public static boolean multifield_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multifield_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIFIELD_VARIABLE, "<multifield variable>");
    r = consumeToken(b, "$?");
    r = r && variable_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'multislot' <slot-name> <template-attribute>* ')'
  public static boolean multislot_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multislot_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTISLOT_DEFINITION, "<multislot definition>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "multislot");
    r = r && slot_name(b, l + 1);
    r = r && multislot_definition_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <template-attribute>*
  private static boolean multislot_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multislot_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!template_attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multislot_definition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'not' <conditional-element> ')'
  public static boolean not_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT_CE, "<not ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "not");
    r = r && conditional_element(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <float> | <integer>
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, "<number>", _FLOAT_, _INTEGER_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, _FLOAT_);
    if (!r) r = consumeToken(b, _INTEGER_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <number>+ | '?VARIABLE'
  public static boolean number_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LIST, "<number list>");
    r = number_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <number>+
  private static boolean number_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!number(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "number_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'object' <attribute-constraint>* ')'
  public static boolean object_pattern_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_pattern_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PATTERN_CE, "<object pattern ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "object");
    r = r && object_pattern_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <attribute-constraint>*
  private static boolean object_pattern_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_pattern_CE_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_constraint(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_pattern_CE_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'or' <conditional-element>+ ')'
  public static boolean or_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_CE, "<or ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "or");
    r = r && or_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <conditional-element>+
  private static boolean or_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_CE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_element(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!conditional_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_CE_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <symbol> <RHS-field>+ ')'
  public static boolean ordered_RHS_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordered_RHS_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORDERED_RHS_PATTERN, "<ordered rhs pattern>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, _SYMBOL_);
    r = r && ordered_RHS_pattern_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <RHS-field>+
  private static boolean ordered_RHS_pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordered_RHS_pattern_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RHS_field(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RHS_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ordered_RHS_pattern_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <symbol> <constraint>* ')'
  public static boolean ordered_pattern_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordered_pattern_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORDERED_PATTERN_CE, "<ordered pattern ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, _SYMBOL_);
    r = r && ordered_pattern_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <constraint>*
  private static boolean ordered_pattern_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordered_pattern_CE_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constraint(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ordered_pattern_CE_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'override-message' ('?DEFAULT' | <message-name>) ')'
  public static boolean override_message_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "override_message_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OVERRIDE_MESSAGE_FACET, "<override message facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "override-message");
    r = r && override_message_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '?DEFAULT' | <message-name>
  private static boolean override_message_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "override_message_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "?DEFAULT");
    if (!r) r = message_name(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <single-field-variable>
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, _SINGLE_FIELD_VARIABLE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_field_variable(b, l + 1);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // <single-field-variable> | '(' <single-field-variable> <type>* [<query>] ')'
  public static boolean parameter_restriction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_restriction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_RESTRICTION, "<parameter restriction>");
    r = single_field_variable(b, l + 1);
    if (!r) r = parameter_restriction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' <single-field-variable> <type>* [<query>] ')'
  private static boolean parameter_restriction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_restriction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && single_field_variable(b, l + 1);
    r = r && parameter_restriction_1_2(b, l + 1);
    r = r && parameter_restriction_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <type>*
  private static boolean parameter_restriction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_restriction_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_restriction_1_2", c)) break;
    }
    return true;
  }

  // [<query>]
  private static boolean parameter_restriction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_restriction_1_3")) return false;
    query(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <ordered-pattern-CE> | <template-pattern-CE> | <object-pattern-CE>
  public static boolean pattern_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_CE, "<pattern ce>");
    r = ordered_pattern_CE(b, l + 1);
    if (!r) r = template_pattern_CE(b, l + 1);
    if (!r) r = object_pattern_CE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'pattern-match' ('reactive' | 'non-reactive') ')'
  public static boolean pattern_match_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_match_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_MATCH_FACET, "<pattern match facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "pattern-match");
    r = r && pattern_match_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'reactive' | 'non-reactive'
  private static boolean pattern_match_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_match_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "reactive");
    if (!r) r = consumeToken(b, "non-reactive");
    return r;
  }

  /* ********************************************************** */
  // '(' 'pattern-match' ('reactive' | 'non-reactive') ')'
  public static boolean pattern_match_role(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_match_role")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_MATCH_ROLE, "<pattern match role>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "pattern-match");
    r = r && pattern_match_role_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'reactive' | 'non-reactive'
  private static boolean pattern_match_role_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_match_role_2")) return false;
    boolean r;
    r = consumeToken(b, "reactive");
    if (!r) r = consumeToken(b, "non-reactive");
    return r;
  }

  /* ********************************************************** */
  // 'deftemplate' | 'defclass' | 'defglobal' | 'deffunction' | 'defgeneric'
  public static boolean port_construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_CONSTRUCT, "<port construct>");
    r = consumeToken(b, "deftemplate");
    if (!r) r = consumeToken(b, "defclass");
    if (!r) r = consumeToken(b, "defglobal");
    if (!r) r = consumeToken(b, "deffunction");
    if (!r) r = consumeToken(b, "defgeneric");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?ALL' | '?NONE' | <port-construct> '?ALL' | <port-construct> '?NONE' | <port-construct> <construct-name>+
  public static boolean port_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_ITEM, "<port item>");
    r = consumeToken(b, "?ALL");
    if (!r) r = consumeToken(b, "?NONE");
    if (!r) r = port_item_2(b, l + 1);
    if (!r) r = port_item_3(b, l + 1);
    if (!r) r = port_item_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <port-construct> '?ALL'
  private static boolean port_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_item_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_construct(b, l + 1);
    r = r && consumeToken(b, "?ALL");
    exit_section_(b, m, null, r);
    return r;
  }

  // <port-construct> '?NONE'
  private static boolean port_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_item_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_construct(b, l + 1);
    r = r && consumeToken(b, "?NONE");
    exit_section_(b, m, null, r);
    return r;
  }

  // <port-construct> <construct-name>+
  private static boolean port_item_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_item_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_construct(b, l + 1);
    r = r && port_item_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <construct-name>+
  private static boolean port_item_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_item_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = construct_name(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!construct_name(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "port_item_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'export' <port-item> ')' | '(' 'import' <module-name> <port-item> ')'
  public static boolean port_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PORT_SPECIFICATION, "<port specification>");
    r = port_specification_0(b, l + 1);
    if (!r) r = port_specification_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'export' <port-item> ')'
  private static boolean port_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "export");
    r = r && port_item(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'import' <module-name> <port-item> ')'
  private static boolean port_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_specification_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "import");
    r = r && module_name(b, l + 1);
    r = r && port_item(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'propagation' ('inherit' | 'no-inherit') ')'
  public static boolean propagation_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propagation_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPAGATION_FACET, "<propagation facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "propagation");
    r = r && propagation_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'inherit' | 'no-inherit'
  private static boolean propagation_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propagation_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "inherit");
    if (!r) r = consumeToken(b, "no-inherit");
    return r;
  }

  /* ********************************************************** */
  // <global-variable> | <function-call>
  public static boolean query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query")) return false;
    if (!nextTokenIs(b, "<query>", _FUNCTION_CALL_, _GLOBAL_VARIABLE_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY, "<query>");
    r = global_variable(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'range' <range-specification> <range-specification> ')'
  public static boolean range_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_ATTRIBUTE, "<range attribute>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "range");
    r = r && range_specification(b, l + 1);
    r = r && range_specification(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <number> | '?VARIABLE'
  public static boolean range_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_SPECIFICATION, "<range specification>");
    r = number(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <single-field-variable>
  public static boolean regular_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regular_parameter")) return false;
    if (!nextTokenIs(b, _SINGLE_FIELD_VARIABLE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_field_variable(b, l + 1);
    exit_section_(b, m, REGULAR_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // '(' role ('concrete' | 'abstract') ')'
  public static boolean role(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "role")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROLE, "<role>");
    r = consumeToken(b, "(");
    r = r && role(b, l + 1);
    r = r && role_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'concrete' | 'abstract'
  private static boolean role_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "role_2")) return false;
    boolean r;
    r = consumeToken(b, "concrete");
    if (!r) r = consumeToken(b, "abstract");
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean rule_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, RULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'salience' <integer-expression> ')' | '(' 'auto-focus' <boolean-symbol> ')'
  public static boolean rule_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_PROPERTY, "<rule property>");
    r = rule_property_0(b, l + 1);
    if (!r) r = rule_property_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'salience' <integer-expression> ')'
  private static boolean rule_property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "salience");
    r = r && integer_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' 'auto-focus' <boolean-symbol> ')'
  private static boolean rule_property_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_property_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "auto-focus");
    r = r && boolean_symbol(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <term> | '~'<term>
  public static boolean single_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_CONSTRAINT, "<single constraint>");
    r = term(b, l + 1);
    if (!r) r = single_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '~'<term>
  private static boolean single_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "~");
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <slot-name> <constraint> ')'
  public static boolean single_field_LHS_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_field_LHS_slot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_FIELD_LHS_SLOT, "<single field lhs slot>");
    r = consumeToken(b, "(");
    r = r && slot_name(b, l + 1);
    r = r && constraint(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' <slot-name> <RHS-field> ')'
  public static boolean single_field_RHS_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_field_RHS_slot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_FIELD_RHS_SLOT, "<single field rhs slot>");
    r = consumeToken(b, "(");
    r = r && slot_name(b, l + 1);
    r = r && RHS_field(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?'<variable-symbol>
  public static boolean single_field_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_field_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_FIELD_VARIABLE, "<single field variable>");
    r = consumeToken(b, "?");
    r = r && variable_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' 'slot' <slot-name> <template-attribute>* ')'
  public static boolean single_slot_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_slot_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_SLOT_DEFINITION, "<single slot definition>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "slot");
    r = r && slot_name(b, l + 1);
    r = r && single_slot_definition_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <template-attribute>*
  private static boolean single_slot_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_slot_definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!template_attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "single_slot_definition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'slot' <name> <facet>* ')' | '(' 'single-slot' <name> <facet>* ')' | '(' 'multislot' <name> <facet>* ')'
  public static boolean slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLOT, "<slot>");
    r = slot_0(b, l + 1);
    if (!r) r = slot_1(b, l + 1);
    if (!r) r = slot_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' 'slot' <name> <facet>* ')'
  private static boolean slot_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "slot");
    r = r && consumeToken(b, _NAME_);
    r = r && slot_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <facet>*
  private static boolean slot_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!facet(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_0_3", c)) break;
    }
    return true;
  }

  // '(' 'single-slot' <name> <facet>* ')'
  private static boolean slot_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "single-slot");
    r = r && consumeToken(b, _NAME_);
    r = r && slot_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <facet>*
  private static boolean slot_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!facet(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_1_3", c)) break;
    }
    return true;
  }

  // '(' 'multislot' <name> <facet>* ')'
  private static boolean slot_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "multislot");
    r = r && consumeToken(b, _NAME_);
    r = r && slot_2_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <facet>*
  private static boolean slot_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!facet(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_2_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <single-slot-definition> | multislot-definition
  public static boolean slot_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLOT_DEFINITION, "<slot definition>");
    r = single_slot_definition(b, l + 1);
    if (!r) r = multislot_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean slot_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, SLOT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean slot_name_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_name_expression")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, SLOT_NAME_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <slot-name-expression> <expression>* ')'
  public static boolean slot_override(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_override")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLOT_OVERRIDE, "<slot override>");
    r = consumeToken(b, "(");
    r = r && slot_name_expression(b, l + 1);
    r = r && slot_override_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <expression>*
  private static boolean slot_override_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_override_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_override_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' 'source' ('exclusive' | 'composite') ')'
  public static boolean source_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "source_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SOURCE_FACET, "<source facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "source");
    r = r && source_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'exclusive' | 'composite'
  private static boolean source_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "source_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "exclusive");
    if (!r) r = consumeToken(b, "composite");
    return r;
  }

  /* ********************************************************** */
  // '(' 'storage' ('local' | 'shared') ')'
  public static boolean storage_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "storage_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE_FACET, "<storage facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "storage");
    r = r && storage_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'local' | 'shared'
  private static boolean storage_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "storage_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "local");
    if (!r) r = consumeToken(b, "shared");
    return r;
  }

  /* ********************************************************** */
  // <string>+ | '?VARIABLE'
  public static boolean string_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LIST, "<string list>");
    r = string_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <string>+
  private static boolean string_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _STRING_);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, _STRING_)) break;
      if (!empty_element_parsed_guard_(b, "string_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean superclass_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superclass_name")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, SUPERCLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <symbol>+ | '?VARIABLE'
  public static boolean symbol_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_LIST, "<symbol list>");
    r = symbol_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <symbol>+
  private static boolean symbol_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, _SYMBOL_)) break;
      if (!empty_element_parsed_guard_(b, "symbol_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <deftemplate-name> <RHS-slot>* ')'
  public static boolean template_RHS_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_RHS_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_RHS_PATTERN, "<template rhs pattern>");
    r = consumeToken(b, "(");
    r = r && deftemplate_name(b, l + 1);
    r = r && template_RHS_pattern_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <RHS-slot>*
  private static boolean template_RHS_pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_RHS_pattern_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RHS_slot(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_RHS_pattern_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <default-attribute> | <constraint-attribute>
  public static boolean template_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_attribute")) return false;
    if (!nextTokenIs(b, "<template attribute>", _CONSTRAINT_ATTRIBUTE_, _DEFAULT_ATTRIBUTE_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ATTRIBUTE, "<template attribute>");
    r = default_attribute(b, l + 1);
    if (!r) r = constraint_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' <deftemplate-name> <LHS-slot>* ')'
  public static boolean template_pattern_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_pattern_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_PATTERN_CE, "<template pattern ce>");
    r = consumeToken(b, "(");
    r = r && deftemplate_name(b, l + 1);
    r = r && template_pattern_CE_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <LHS-slot>*
  private static boolean template_pattern_CE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_pattern_CE_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LHS_slot(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_pattern_CE_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <constant> | <single-field-variable> | <multifield-variable> | ':'<function-call> | '='<function-call>
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = constant(b, l + 1);
    if (!r) r = single_field_variable(b, l + 1);
    if (!r) r = multifield_variable(b, l + 1);
    if (!r) r = term_3(b, l + 1);
    if (!r) r = term_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':'<function-call>
  private static boolean term_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && function_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '='<function-call>
  private static boolean term_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && function_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'test' <function-call> ')'
  public static boolean test_CE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test_CE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST_CE, "<test ce>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "test");
    r = r && function_call(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <class-name>
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, _CLASS_NAME_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'type' <type-specification> ')'
  public static boolean type_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ATTRIBUTE, "<type attribute>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "type");
    r = r && type_specification(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <allowed-type>+ | '?VARIABLE'
  public static boolean type_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFICATION, "<type specification>");
    r = type_specification_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <allowed-type>+
  private static boolean type_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allowed_type(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!allowed_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_specification_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <constant>+ | '?VARIABLE'
  public static boolean value_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_LIST, "<value list>");
    r = value_list_0(b, l + 1);
    if (!r) r = consumeToken(b, "?VARIABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <constant>+
  private static boolean value_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!constant(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <single-field-variable> | <multifield-variable> | <global-variable>
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = single_field_variable(b, l + 1);
    if (!r) r = multifield_variable(b, l + 1);
    if (!r) r = global_variable(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <symbol>
  public static boolean variable_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_symbol")) return false;
    if (!nextTokenIs(b, _SYMBOL_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _SYMBOL_);
    exit_section_(b, m, VARIABLE_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // '(' 'visibility' ('private' | 'public') ')'
  public static boolean visibility_facet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_facet")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY_FACET, "<visibility facet>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, "visibility");
    r = r && visibility_facet_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'private' | 'public'
  private static boolean visibility_facet_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_facet_2")) return false;
    boolean r;
    r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "public");
    return r;
  }

  /* ********************************************************** */
  // <multifield-variable>
  public static boolean wildcard_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wildcard_parameter")) return false;
    if (!nextTokenIs(b, _MULTIFIELD_VARIABLE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multifield_variable(b, l + 1);
    exit_section_(b, m, WILDCARD_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // <multifield-variable> | '(' <multifield-variable> <type>* [<query>] ')'
  public static boolean wildcard_parameter_restriction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wildcard_parameter_restriction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WILDCARD_PARAMETER_RESTRICTION, "<wildcard parameter restriction>");
    r = multifield_variable(b, l + 1);
    if (!r) r = wildcard_parameter_restriction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' <multifield-variable> <type>* [<query>] ')'
  private static boolean wildcard_parameter_restriction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wildcard_parameter_restriction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && multifield_variable(b, l + 1);
    r = r && wildcard_parameter_restriction_1_2(b, l + 1);
    r = r && wildcard_parameter_restriction_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // <type>*
  private static boolean wildcard_parameter_restriction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wildcard_parameter_restriction_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "wildcard_parameter_restriction_1_2", c)) break;
    }
    return true;
  }

  // [<query>]
  private static boolean wildcard_parameter_restriction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wildcard_parameter_restriction_1_3")) return false;
    query(b, l + 1);
    return true;
  }

}
