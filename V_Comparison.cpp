#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int a, b;
    char c;
    cin >> a >> c >> b;
    if ((c == '>' && a > b) || (c == '<' && a < b) || (c == '=' && a == b))
        cout << "Right" << endl;
    else
        cout << "Wrong" << endl;
    return 0;
}