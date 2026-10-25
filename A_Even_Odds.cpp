#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long n, k, ans, half;
    cin >> n >> k;

    half = (n + 1) / 2;
    if (k > half)
    {
        k -= half;
        ans = 2 * k;
    }
    else
    {
        ans = 2 * k - 1;
    }

    cout << ans << '\n';
    return 0;
}