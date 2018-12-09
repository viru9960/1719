#ifndef STAFF_H
#define STAFF_H
#include<string>

using namespace std;
class Staff
{
    public:
        Staff();
        Staff(string name,string lname);
        void display();
        virtual ~Staff();

    protected:
        string name;
        string lname;
    private:
};

#endif // STAFF_H
