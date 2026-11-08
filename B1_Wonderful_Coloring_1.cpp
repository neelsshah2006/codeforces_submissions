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
        string s;
        cin >> s;
        unordered_map<char, int> mp;
        int ans = s.size();
        for (char c : s)
        {
            mp[c] = mp[c] + 1;
            if (mp[c] > 2)
            {
                ans--;
            }
        }
        cout << ans / 2 << '\n';
    }
    return 0;
}