#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;

        vector<int> a(n);

        for (int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.rbegin(), a.rend());

        unordered_set<int> st;
        int cnt = 0;

        for (int x : a)
        {
            while (x % 2 == 0 && st.find(x) == st.end())
            {
                st.insert(x);
                x /= 2;
                cnt++;
            }
        }

        cout << cnt << '\n';
    }

    return 0;
}