#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, prev = INT_MIN, curr, ans = 0;
    cin >> n;
    cin >> curr;
    for (int i = 1; i < n; i++)
    {
        prev = max(prev, curr);
        cin >> curr;
        if (prev < curr)
        {
            ans += (curr - prev) * i;
        }
        else
        {
            ans += (prev - curr);
        }
    }
    cout << ans << '\n';
    return 0;
}