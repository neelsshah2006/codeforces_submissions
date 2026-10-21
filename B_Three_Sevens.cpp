
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
        int m;
        cin >> m;

        vector<vector<int>> lists(m);
        for (int i = 0; i < m; i++)
        {
            int n;
            cin >> n;

            lists[i].resize(n);
            for (int j = 0; j < n; j++)
            {
                cin >> lists[i][j];
            }
        }

        unordered_set<int> st;
        vector<int> res(m);

        bool possible = true;

        for (int i = m - 1; i >= 0; i--)
        {
            bool added = false;

            for (int num : lists[i])
            {
                if (st.find(num) == st.end())
                {
                    res[i] = num;
                    added = true;
                    break;
                }
            }

            if (!added)
            {
                cout << -1 << '\n';
                possible = false;
                break;
            }

            for (int num : lists[i])
            {
                st.insert(num);
            }
        }

        if (!possible)
        {
            continue;
        }

        for (int i = 0; i < m; i++)
        {
            if (i > 0)
                cout << ' ';
            cout << res[i];
        }
        cout << '\n';
    }

    return 0;
}
