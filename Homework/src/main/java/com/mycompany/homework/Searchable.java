//Közepes — Searchable interface
//Definiálj Searchable interface-t: boolean matches(String text);
//Implementáld egy egyszerű News modellen — keressen titleban
//és description-ben.
package com.mycompany.homework;


// Defines an interface for objects that can be searched.
public interface Searchable {

    // Returns true if the object matches the given search text.
    boolean matches(String text);
}