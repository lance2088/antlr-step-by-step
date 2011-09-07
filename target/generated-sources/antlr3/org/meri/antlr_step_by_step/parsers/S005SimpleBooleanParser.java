// $ANTLR 3.3 Nov 30, 2010 12:46:29 org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g 2011-08-17 23:09:26

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class S005SimpleBooleanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LPAREN", "RPAREN", "AND", "OR", "NOT", "NAME"
    };
    public static final int EOF=-1;
    public static final int LPAREN=4;
    public static final int RPAREN=5;
    public static final int AND=6;
    public static final int OR=7;
    public static final int NOT=8;
    public static final int NAME=9;

    // delegates
    // delegators


        public S005SimpleBooleanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public S005SimpleBooleanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return S005SimpleBooleanParser.tokenNames; }
    public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g"; }


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:33:1: expression : andexpression ;
    public final S005SimpleBooleanParser.expression_return expression() throws RecognitionException {
        S005SimpleBooleanParser.expression_return retval = new S005SimpleBooleanParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        S005SimpleBooleanParser.andexpression_return andexpression1 = null;



        try {
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:33:12: ( andexpression )
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:33:14: andexpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andexpression_in_expression121);
            andexpression1=andexpression();

            state._fsp--;

            adaptor.addChild(root_0, andexpression1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class andexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andexpression"
    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:35:1: andexpression : orexpression ( AND orexpression )* ;
    public final S005SimpleBooleanParser.andexpression_return andexpression() throws RecognitionException {
        S005SimpleBooleanParser.andexpression_return retval = new S005SimpleBooleanParser.andexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND3=null;
        S005SimpleBooleanParser.orexpression_return orexpression2 = null;

        S005SimpleBooleanParser.orexpression_return orexpression4 = null;


        Object AND3_tree=null;

        try {
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:35:15: ( orexpression ( AND orexpression )* )
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:35:17: orexpression ( AND orexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orexpression_in_andexpression129);
            orexpression2=orexpression();

            state._fsp--;

            adaptor.addChild(root_0, orexpression2.getTree());
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:35:30: ( AND orexpression )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case AND:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:35:31: AND orexpression
            	    {
            	    AND3=(Token)match(input,AND,FOLLOW_AND_in_andexpression132); 
            	    AND3_tree = (Object)adaptor.create(AND3);
            	    adaptor.addChild(root_0, AND3_tree);

            	    pushFollow(FOLLOW_orexpression_in_andexpression134);
            	    orexpression4=orexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, orexpression4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andexpression"

    public static class orexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orexpression"
    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:37:1: orexpression : notexpression ( OR notexpression )* ;
    public final S005SimpleBooleanParser.orexpression_return orexpression() throws RecognitionException {
        S005SimpleBooleanParser.orexpression_return retval = new S005SimpleBooleanParser.orexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR6=null;
        S005SimpleBooleanParser.notexpression_return notexpression5 = null;

        S005SimpleBooleanParser.notexpression_return notexpression7 = null;


        Object OR6_tree=null;

        try {
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:37:14: ( notexpression ( OR notexpression )* )
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:37:16: notexpression ( OR notexpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notexpression_in_orexpression144);
            notexpression5=notexpression();

            state._fsp--;

            adaptor.addChild(root_0, notexpression5.getTree());
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:37:30: ( OR notexpression )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:37:31: OR notexpression
            	    {
            	    OR6=(Token)match(input,OR,FOLLOW_OR_in_orexpression147); 
            	    OR6_tree = (Object)adaptor.create(OR6);
            	    adaptor.addChild(root_0, OR6_tree);

            	    pushFollow(FOLLOW_notexpression_in_orexpression149);
            	    notexpression7=notexpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notexpression7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orexpression"

    public static class notexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notexpression"
    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:39:1: notexpression : ( NOT atom | atom );
    public final S005SimpleBooleanParser.notexpression_return notexpression() throws RecognitionException {
        S005SimpleBooleanParser.notexpression_return retval = new S005SimpleBooleanParser.notexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT8=null;
        S005SimpleBooleanParser.atom_return atom9 = null;

        S005SimpleBooleanParser.atom_return atom10 = null;


        Object NOT8_tree=null;

        try {
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:39:15: ( NOT atom | atom )
            int alt3=2;
            switch ( input.LA(1) ) {
            case NOT:
                {
                alt3=1;
                }
                break;
            case LPAREN:
            case NAME:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:39:17: NOT atom
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT8=(Token)match(input,NOT,FOLLOW_NOT_in_notexpression159); 
                    NOT8_tree = (Object)adaptor.create(NOT8);
                    adaptor.addChild(root_0, NOT8_tree);

                    pushFollow(FOLLOW_atom_in_notexpression161);
                    atom9=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom9.getTree());

                    }
                    break;
                case 2 :
                    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:39:28: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_notexpression165);
                    atom10=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notexpression"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:40:1: atom : ( NAME | LPAREN andexpression RPAREN );
    public final S005SimpleBooleanParser.atom_return atom() throws RecognitionException {
        S005SimpleBooleanParser.atom_return retval = new S005SimpleBooleanParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME11=null;
        Token LPAREN12=null;
        Token RPAREN14=null;
        S005SimpleBooleanParser.andexpression_return andexpression13 = null;


        Object NAME11_tree=null;
        Object LPAREN12_tree=null;
        Object RPAREN14_tree=null;

        try {
            // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:40:6: ( NAME | LPAREN andexpression RPAREN )
            int alt4=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt4=1;
                }
                break;
            case LPAREN:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:40:8: NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME11=(Token)match(input,NAME,FOLLOW_NAME_in_atom172); 
                    NAME11_tree = (Object)adaptor.create(NAME11);
                    adaptor.addChild(root_0, NAME11_tree);


                    }
                    break;
                case 2 :
                    // org\\meri\\antlr_step_by_step\\parsers\\S005SimpleBoolean.g:40:15: LPAREN andexpression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom176); 
                    LPAREN12_tree = (Object)adaptor.create(LPAREN12);
                    adaptor.addChild(root_0, LPAREN12_tree);

                    pushFollow(FOLLOW_andexpression_in_atom178);
                    andexpression13=andexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, andexpression13.getTree());
                    RPAREN14=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom180); 
                    RPAREN14_tree = (Object)adaptor.create(RPAREN14);
                    adaptor.addChild(root_0, RPAREN14_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_andexpression_in_expression121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orexpression_in_andexpression129 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_andexpression132 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_orexpression_in_andexpression134 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_notexpression_in_orexpression144 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_OR_in_orexpression147 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_notexpression_in_orexpression149 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NOT_in_notexpression159 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_atom_in_notexpression161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_notexpression165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_atom172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom176 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_andexpression_in_atom178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_atom180 = new BitSet(new long[]{0x0000000000000002L});

}