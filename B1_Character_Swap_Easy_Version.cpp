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
        string a, b;
        cin >> a >> b;

        unordered_map<char, char> chars;
        unordered_map<char, int> counts;
        bool ans = true;
        for (int i = 0; i < n; i++)
        {
            if (a[i] != b[i])
            {
                if (chars.find(a[i]) == chars.end())
                {
                    chars[a[i]] = b[i];
                }

                if (chars[a[i]] == b[i])
                {
                    counts[a[i]]++;
                }
                else
                {
                    ans = false;
                    break;
                }
            }
        }

        if (ans && chars.size() == 1 && counts[(*chars.begin()).first] % 2 == 0)
        {
            cout << "Yes\n";
        }
        else
            cout << "No\n";
    }
    return 0;
}