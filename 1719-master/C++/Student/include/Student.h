#ifndef STUDENT_H
#define STUDENT_H
#include<string>

using namespace std;

class Student
{
      protected:
        string name;
        string lname;
        string dep;
        int roll;

    public:
        Student(string name,string lname,string dept,int roll);
        void display();
        virtual ~Student();



    private:
};

#endif // STUDENT_H
