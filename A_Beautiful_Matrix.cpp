#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    int ans;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cin >> n;
            if (n == 1)
            {
                ans = abs(i - 2) + abs(j - 2);
            }
        }
    }
    cout << ans << '\n';
    return 0;
}