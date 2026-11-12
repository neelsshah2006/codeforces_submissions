#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int a[n];
    vector<int> folders;
    int size = 0;
    int negs = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] < 0)
            negs++;
        if (negs == 3)
        {
            folders.push_back(size);
            size = 0;
            negs = 1;
        }
        size++;
    }

    if (size > 0)
        folders.push_back(size);

    cout << folders.size() << '\n';
    for (int x : folders)
        cout << x << " ";
    cout << "\n";
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}