#include <iostream>
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

        int num;
        cin >> num;
        bool ans = num == 1;
        for (int i = 1; i < n; i++)
        {
            cin >> num;
        }

        cout << (ans ? "YES" : "NO") << '\n';
    }
    return 0;
}