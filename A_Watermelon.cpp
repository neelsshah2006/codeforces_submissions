#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int w;
    cin >> w;
    if (w % 2 == 0 && w >= 4)
        cout << "YES" << '\n';
    else
        cout << "NO" << '\n';
    return 0;
}