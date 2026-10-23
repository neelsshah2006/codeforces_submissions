#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;

    for (int i = 1; i < n / 2 + 1; i++)
    {
        if (n % i == 0)
            cout << i << '\n';
    }
    cout << n << '\n';
    return 0;
}