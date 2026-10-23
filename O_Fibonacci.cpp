#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    if (n == 1)
    {
        cout << 0 << '\n';
        return 0;
    }

    long long x = 0, y = 1;
    for (int i = 3; i <= n; i++)
    {
        long long tmp = x + y;
        x = y;
        y = tmp;
    }
    cout << y << '\n';
    return 0;
}