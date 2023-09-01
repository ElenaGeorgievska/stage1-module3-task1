# Generics

In Generics class you find 3 methods to refactor.

## Method-1:
Refactor boxingMethod to use only parameterized lists.

public List boxingMethod(String name) { 

List firstList = new ArrayList<>();

firstList.add(name);

List secondList = new ArrayList<>();

secondList.add(firstList);

return secondList;

}

## Method-2:
Refactor genericMethod, it should take any specific object and return it.

public Object genericMethod(Object data) {

        return data;

}

## Method-3:
Refactor cloneMethod, it should take two lists and be able to place objects from
producer to consumer list.

public void cloneMethod(List consumer, List producer) {

        consumer.addAll(producer);
}