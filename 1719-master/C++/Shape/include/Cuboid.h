#ifndef CUBOID_H
#define CUBOID_H
#include"Three_D_shape.h"


class Cuboid: public Three_D_shape
{
    public:
        int len;
        int base;
        int height;

        Cuboid(int len,int base,int height);
        void volume_of_cuboid();
        virtual ~Cuboid();

    protected:

    private:
};

#endif // CUBOID_H
