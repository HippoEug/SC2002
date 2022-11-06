
#ifndef ANIMAL_HPP_
#define ANIMAL_HPP_

#include <iostream>
#include <string>
#include <vector>

enum COLOR {Green, Blue, White, Black, Brown};
//const char* reverseCOLOR[]{"Green", "Blue", "White", "Black", "Brown"};

class Animal {
private:
    std::string _name;
    COLOR _color;

public:
    Animal();
    Animal(std::string name, COLOR color);
    virtual ~Animal();

    virtual void move() = 0; // declaring move() as a pure method
    virtual void speak() const;

    std::string getName();
    //std::string getColor();
    COLOR getColor();
};

class Mammal: public Animal {
public:
    Mammal();
    Mammal(std::string name, COLOR color);
    ~Mammal();

    virtual void move();
    virtual void eat();
};

#endif /* ANIMAL_HPP_ */
