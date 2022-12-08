package com.epam.mjc;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        Predicate <List <String>> res = l -> {
            for (String str : l){
                if (!(str.charAt(0) > 'A' && str.charAt(0) < 'Z' )) return false;
            }
            return true;
        };
        return res;
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        Consumer <List <Integer>> res = l ->{
            List <Integer> evenValues = new ArrayList<>();
            for (int temp : l){
                if(temp %2 == 0) evenValues.add(temp);
            }
            l.addAll(evenValues);
        };
        return res;
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        Supplier <List <String>> res = () ->{
            List <String> filtered = new ArrayList<>();
            for (String str : values ){
                if(str.charAt(0) > 'A'
                        && str.charAt(0) < 'Z'
                        && str.endsWith(".")
                        && str.split(" ").length > 3)
                {
                    filtered.add(str);
                }
            }
            return filtered;
        };
        return res;
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Function <List <String>, Map <String, Integer>> res = l ->{
            Map <String, Integer> calc = new TreeMap<>();
            for (String str : l){
                calc.put(str, str.length());
            }
            return calc;
         };
        return res;
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        BiFunction <List <Integer>, List <Integer>, List <Integer> > res = (l1, l2) -> {
            List <Integer> merged = new ArrayList<>();
           merged.addAll(l1);
           merged.addAll(l2);
           return merged;
        };
        return res;
    }
}
