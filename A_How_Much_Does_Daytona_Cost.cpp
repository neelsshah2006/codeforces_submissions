#include <iostream>
#include <vector>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n, k;
        cin >> n >> k;

        int tmp;
        bool exist = false;
        for (int i = 0; i < n; i++)
        {
            cin >> tmp;
            if (tmp == k)
                exist = true;
        }

        cout << (exist ? "YES" : "NO") << '\n';
    }
    return 0;
}