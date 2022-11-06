
#ifndef CHILDANIMAL_HPP_
#define CHILDANIMAL_HPP_

#include "Animal.hpp"
#include <iostream>
#include <string>
#include <vector>

class Dog: public Mammal {
private:
    std::string _owner;

public:
    Dog();
    Dog(std::string name, COLOR color, std::string owner);
    ~Dog();

    void move();
    void speak() const;
    void eat();
};

class Cat: public Mammal {
private:
    std::string _owner;

public:
    Cat();
    Cat(std::string name, COLOR color, std::string owner);
    ~Cat();

    void move();
    void speak() const;
    void eat();
};

class Lion: public Mammal {
private:
    std::string _owner;

public:
    Lion();
    Lion(std::string name, COLOR color, std::string owner);
    ~Lion();

    void move();
    void speak() const;
    void eat();
};

#endif /* CHILDANIMAL_HPP_ */
