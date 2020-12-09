package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{

        @Override
        public int priority() {
            return 3;
        }

        public Operand execute(Operand operandOne, Operand operandTwo) {
            double value1 = Math.pow(operandOne.getValue(), operandTwo.getValue());
            //Casting
            int value2= (int)value1;
            Operand value = new Operand(value2);
            return value;
        }

    }

