#ifndef ROW_H
#define ROW_H

#include "irow.hpp"
#include "iarray2d.hpp"

namespace data_structures
{
	template <class T>
	class IArray2D;

	template <class T>
	class Row final : public IRow<T>
	{
	public:
		Row(const IArray2D<T>& arr, const int row_index);
		~Row() = default;
		T& operator[](const int& column) override;
		T operator[](const int& column) const override;

	private:
		const IArray2D<T>& arr_;
		const int row_;
	};


	template <class T>
	Row<T>::Row(const IArray2D<T>& arr, const int row_index)
		:arr_(arr), row_(row_index){ }

	template <class T>
	T& Row<T>::operator[](const int& column)
	{
		//look up how to strip const without doing const_cast<IArray2D<T>&>(arr_).Select(row, column);
		return const_cast<IArray2D<T>&>(arr_).Select(row_, column);
	}

	template <class T>
	T Row<T>::operator[](const int& column) const
	{
	return arr_.Select(row_, column);
	}
}
#endif 