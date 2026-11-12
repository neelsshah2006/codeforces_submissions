#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    string s;
    cin >> s;
    int manual = 0;
    bool red = true;
    for (int i = 0; i < n; i++)
    {
        if ((red && s[i] == 'B') || (!red && s[i] == 'R'))
        {
            manual++;
        }
        else
        {
            red = !red;
        }
    }
    cout << manual << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        solve();
    }
    return 0;
}