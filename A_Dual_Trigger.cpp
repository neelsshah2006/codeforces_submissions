#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n;
        cin >> n;
        string s;
        cin >> s;

        int cnt = count(s.begin(), s.end(), '1');
        if (cnt % 2 != 0 || (cnt == 2 && s.find("11") != -1))
        {
            cout << "NO\n";
            continue;
        }

        cout << "YES\n";
    }
    return 0;
}