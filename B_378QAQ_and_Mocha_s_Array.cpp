#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    sort(a, a + n);
    unordered_set<int> st;
    int i = 1;
    int idx = 0;
    bool first = true;
    int next = -1;
    int size = n - 1;
    for (; i < n; i++)
    {
        if (a[i] % a[idx] == 0)
        {
            st.insert(a[i]);
            size--;
        }
        else if (first)
        {
            next = i;
            first = false;
        }
    }

    if (first)
    {
        cout << "Yes\n";
        return;
    }

    i = next + 1;
    size--;
    for (; i < n; i++)
    {
        if (st.find(a[i]) == st.end() && a[i] % a[next] == 0)
        {
            size--;
        }
    }

    cout << (size == 0 ? "Yes\n" : "No\n");
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