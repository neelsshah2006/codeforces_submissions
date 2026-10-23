#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;

    int tmp = n, cnt = 0, msb = 0;
    while (tmp > 0)
    {
        msb = tmp % 10;
        tmp /= 10;
        cnt++;
    }
    int dest = (msb + 1) * pow(10, cnt - 1);
    cout << dest - n << '\n';
    return 0;
}