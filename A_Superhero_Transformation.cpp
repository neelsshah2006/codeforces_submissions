#include <bits/stdc++.h>
using namespace std;

const unordered_set<char> vowels = {'a', 'e', 'i', 'o', 'u'};

void solve()
{
    string s, t;
    cin >> s >> t;

    if (s.size() != t.size())
    {
        cout << "No\n";
        return;
    }

    int n = s.size();
    for (int i = 0; i < n; i++)
    {
        if (s[i] == t[i])
            continue;

        if (!(vowels.find(s[i]) != vowels.end() && vowels.find(t[i]) != vowels.end()) && !(vowels.find(s[i]) == vowels.find(t[i])))
        {
            cout << "No\n";
            return;
        }
    }

    cout << "Yes\n";
    return;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}