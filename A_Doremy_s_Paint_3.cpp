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
        int n, curr;
        cin >> n;
        unordered_map<int, int> mp;
        for (int i = 0; i < n; i++)
        {
            cin >> curr;
            mp[curr] = mp[curr] + 1;
        }

        bool ans = true;
        if (mp.size() > 2)
        {
            ans = false;
        }
        else if (mp.size() == 2)
        {
            for (auto &[k, v] : mp)
            {
                if (v != n / 2 && v != n - n / 2)
                    ans = false;
            }
        }

        cout << (ans ? "Yes" : "No") << '\n';
    }
    return 0;
}