
#include "Animal.hpp"
#include "childAnimal.hpp"
#include <iostream>
#include <string>
#include <vector>

int main() {
    /*
    Mammal c;
    c.speak();
    std::cout << std::endl;

    Mammal d("coke", Black);
    d.speak();
    std::cout << std::endl;

    Dog e;
    e.speak();
    e.move();
    std::cout << std::endl;

    Dog f("johnson", Blue, "kingyan");
    f.speak();
    f.move();
    std::cout << std::endl;

    Animal *animalPtr = new Dog("Lassie", White, "Andy");
    animalPtr->speak();
    animalPtr->move();
    std::cout << std::endl;
    delete animalPtr;

    Dog dogi("Lasssie", White, "Andy");
    Mammal *aniPtr = &dogi;
    Mammal &aniRef = dogi;
    Mammal aniVal = dogi;
    aniPtr->speak();
    aniRef.speak();
    aniVal.speak();

    std::cout << std::endl << "Program exiting ..." << std::endl;
    */

    int choice = 0;
    std::vector<Mammal*> mammals;

    mammals.push_back(new Dog("Johnson", White, "KingYan"));
    mammals.push_back(new Cat("Smokey", Black, "Nagata"));
    mammals.push_back(new Lion("Coke", Blue, "Black"));

    do {
        std::cout << "\nSelect the animal to send to Zoo: " << std::endl;
        std::cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << std::endl;
        std::cin >> choice;

        switch(choice) {
            case 1:
                mammals[0]->move();
                mammals[0]->speak();
                mammals[0]->eat();
                break;
            case 2:
                mammals[1]->move();
                mammals[1]->speak();
                mammals[1]->eat();
                break;
            case 3:
                mammals[2]->move();
                mammals[2]->speak();
                mammals[2]->eat();
                break;
            case 4:
                for (int i = 0; i < 3; i++) {
                    mammals[i]->move();
                    mammals[i]->speak();
                    mammals[i]->eat();
                }
                break;
        }
    } while (choice != 5);

    for (int i = 0; i < mammals.size(); i++) {
        delete mammals[i];
    }
    mammals.clear();
    std::cout << std::endl << "Program exiting ..." << std::endl;
}

